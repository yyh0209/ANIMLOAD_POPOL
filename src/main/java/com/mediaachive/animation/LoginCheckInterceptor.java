package com.mediaachive.animation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//model modelandview는 차이가 있다. 스트링값을 모델엔뷰로 담아줘서 처리하고 jsp로 간다.
		String uri = request.getRequestURI(); //문자열로된 주소값을 uri로 요청한다.
		String[] uriArr = uri.split("/");// 문자열로 경로를 나눈다
	
		System.out.println("인터셉터!");
		System.out.println("uri :"+uri);
		
		if(uri.equals("/")) {
			return true;
		}else if(uriArr[1].equals("res")) {
			return true;
		}
		HttpSession hs = request.getSession(); // 로그인 세션을
		System.out.println("인터셉터");
		boolean isLogout = SecurityUtils.isLogout(request);  //세션을 받았는기 그러면 login을 통과
		
		switch (uriArr[1]) {
		case ViewRef.URI_USER:
			switch (uriArr[2]) {
			//login상태 혹은 get방식,post방식은 다 걸린다.
			case "login": case "join":
				if(!isLogout) {
					//로그인 상태
					response.sendRedirect("/rest/map"); //기본페이지로 날림.
					return false;
					//로그인상태인데 로그인을 할 경우
				}
			}
		case ViewRef.URI_MEDIA:
			//2차 주소값에는 
			switch (uriArr[2]) {
			case "reg":
				//로그아웃이 된 상태에선.
				if(isLogout) { //로그아웃상태.
					response.sendRedirect("/user/login");
					return false;
				}
			// 무조건 로그인이 된 상태에서 진입한다.
			}
		}
		return true; // 거짓을 반환
	}
}
