package com.mediaarchive.animation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	//메인홈페이지로 날리는 역할.
	@RequestMapping("/")
	public String index(HttpServletRequest req) {		
		if(Const.realpath == null) {
			Const.realpath = req.getServletContext().getRealPath("");
		}
		System.out.println("root!!");
		return "redirect:/rest/map";
		//jsp로 전상할 주소값을 설정 메인홈페이지로 날린다.
		//1차주소값은
	}
}
