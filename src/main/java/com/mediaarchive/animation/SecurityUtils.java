package com.mediaarchive.animation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.mediaarchive.animation.User.model.UserVO;

public class SecurityUtils {
	//로그인한 user의 pk값을 세션에 담는 기능
	public static int getLoginUserPk(HttpServletRequest request) {
		return getLoginUserPk(request.getSession());
	}
	//로그인 한사람의 키값
	public static int getLoginUserPk(HttpSession hs) {
		UserVO loginUser = (UserVO)hs.getAttribute(Const.LOGIN_USER);
		return loginUser == null ? 0 : loginUser.getI_user();
		//null이면 0 아니면 회원정보를 반환.
	}
	//로그인 한 사람의 요청
	public static UserVO getLoginUser(HttpServletRequest request) {
		HttpSession hs = request.getSession();
		return (UserVO)hs.getAttribute(Const.LOGIN_USER);
	}
	//로그아웃이 실행됬을떼 null로 바꿈
	public static boolean isLogout(HttpServletRequest request) {
		return getLoginUser(request) ==null; 
		//초기화 시키는 작업
	}
	public static String generateSalt() {
		return BCrypt.gensalt(); //패스워드를 암호화
	}
	//비밀번호와 salt가 합쳐진 결과
	public static String getEncrypt(String pw, String salt) {
		return BCrypt.hashpw(pw, salt);
	}
}
