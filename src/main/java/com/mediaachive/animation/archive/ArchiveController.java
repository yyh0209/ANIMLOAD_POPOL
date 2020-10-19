package com.mediaachive.animation.archive;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.mediaachive.animation.Const;
import com.mediaachive.animation.SecurityUtils;
import com.mediaachive.animation.ViewRef;
import com.mediaachive.animation.archive.model.ArchivePARAM;

@Controller
//메인 주소값
@RequestMapping("/gallery")
public class ArchiveController {
	@Autowired
	private ArcService service;
	
	//메인화면으로
	@RequestMapping("/map")
	public String restMap(Model model) {
		model.addAttribute(Const.TITLE, "지도보기"); //
		model.addAttribute(Const.VIEW, "gallery/restMap"); //2차 주소값으로 날아감.
		return ViewRef.TEMP_MENU_TEMP; //메뉴로 들어감.
		
		//
	}
	
	//등록 
	@RequestMapping("/reg")
	public String restReg(Model model) {
		model.addAttribute("categoryList", service.selCategoryList());
		
		model.addAttribute(Const.TITLE, "가게 등록"); //
		model.addAttribute(Const.VIEW, "rest/restReg");
		return ViewRef.TEMP_MENU_TEMP;
	}
	
	//등록하기 
	@RequestMapping(value="/reg", method=RequestMethod.POST)
	public String restReg(ArchivePARAM param, HttpSession hs) {
		param.setI_user(SecurityUtils.getLoginUserPk(hs));		
		int result = service.insRest(param);
		return "redirect:/";
	}
	
}
