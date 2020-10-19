package com.mediaarchive.animation.User;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mediaarchive.animation.Const;
import com.mediaarchive.animation.SecurityUtils;
import com.mediaarchive.animation.ViewRef;
import com.mediaarchive.animation.User.model.UserPARAM;
import com.mediaarchive.animation.User.model.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession hs) {
		hs.invalidate();
		return "redirect:/";
	} //로그아웃하면 정보를 다 날림.
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		System.out.println("Controller - login");
		model.addAttribute(Const.TITLE, "로그인");
		model.addAttribute(Const.VIEW, "user/login");
		return ViewRef.TEMP_DEFAULT;
	} //로그인 로그아웃은 전부 get 방식 `
	
	@RequestMapping(value="/login", method = RequestMethod.POST) 
	public String login(UserPARAM param, HttpSession hs, RedirectAttributes ra) {
		//userparam은 로그인한사람이 쓴다
		int result = service.login(param);
		
		if(result == Const.SUCCESS) {
			hs.setAttribute(Const.LOGIN_USER, param);
			return "redirect:/";
		}
		
		String msg = null;
		if(result == Const.NO_ID) {
			msg = "아이디를 확인해 주세요.";
		} else if(result == Const.NO_PW) {
			msg = "비밀번호를 확인해 주세요.";
		}
		
		param.setMsg(msg);
		ra.addFlashAttribute("data", param); //일회성데이터
		return "redirect:/user/login"; //값을 전달할 jsp의 주소값
	}
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join(Model model, @RequestParam(defaultValue="0") int err) {
		System.out.println("err : " + err);
		
		if(err > 0) {
			model.addAttribute("msg", "에러가 발생하였습니다.");
		}
		model.addAttribute(Const.TITLE, "회원가입");
		model.addAttribute(Const.VIEW, "user/join");
		return ViewRef.TEMP_DEFAULT;
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String join(UserVO param, RedirectAttributes ra) {
		int result = service.join(param);
		
		if(result == 1) {
			return "redirect:/user/login"; 
		}
		
		ra.addAttribute("err", result);
		return "redirect:/user/join";
	}
	
	@RequestMapping(value="/ajaxIdChk", method=RequestMethod.POST)
	@ResponseBody
	public String ajaxIdChk(@RequestBody UserPARAM param) {
		System.out.println("user_id : " + param.getUser_id());
		int result = service.login(param);
		return String.valueOf(result);
	}
	
	@RequestMapping(value="/ajaxToggleFavorite", method=RequestMethod.GET)
	@ResponseBody
	public int ajaxToggleFavorite(UserPARAM param, HttpSession hs) {
		System.out.println("==> ajaxToggleFavorite");
		int i_user = SecurityUtils.getLoginUserPk(hs);
		param.setI_user(i_user);
		return service.ajaxToggleFavorite(param);
	}
	
	
	@RequestMapping("/favorite")
	public String favorite(Model model, HttpSession hs) {
		int i_user = SecurityUtils.getLoginUserPk(hs);		
		UserPARAM param = new UserPARAM();
		param.setI_user(i_user);
		
		model.addAttribute("data", service.selFavoriteList(param));
		
		model.addAttribute(Const.CSS, new String[]{"userFavorite"});
		model.addAttribute(Const.TITLE, "찜");
		model.addAttribute(Const.VIEW, "user/favorite");
		return ViewRef.TEMP_MENU_TEMP;
	}
}



























