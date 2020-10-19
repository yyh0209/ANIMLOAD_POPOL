package com.mediaarchive.animation.gallery;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mediaarchive.animation.SecurityUtils;
import com.mediaarchive.animation.gallery.model.GalleryDMI;
import com.mediaarchive.animation.gallery.model.GalleryPARAM;

@Controller
@RequestMapping("/gallery")
public class GalleryController {
	@Autowired
	private GalleryService service;
	
	//주소값을 매핑
	@RequestMapping("/value=\"/ajaxGetList\", produces = {\"application/json; charset=UTF-8\"}")
	@ResponseBody
	//ajax통신으로 날린다.
	public List<GalleryDMI> ajaxGelList(GalleryPARAM param, HttpSession hs){
		//도메인
		//내 회원정보를 세션에 담아 서 서비스로 반환
		int i_user = SecurityUtils.getLoginUserPk(hs);
		param.setI_user(i_user);
		return service.selPicList(param);
	}
	
	//영상,gif,사진을 등록하는 작업
	@RequestMapping("/reg")
	public String picReg(Model model) {
		model.addAttribute("categoryList",service.selCategoryList());//장르별로 쏘기
		//작품들을 최종 업로드
		//
		//메인화면으로 쏘기
	}
}
