package com.mediaarchive.animation.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaarchive.animation.Const;
import com.mediaarchive.animation.SecurityUtils;
import com.mediaarchive.animation.User.model.UserDMI;
import com.mediaarchive.animation.User.model.UserPARAM;
import com.mediaarchive.animation.User.model.UserVO;
import com.mediaarchive.animation.gallery.GalleryMapper;
import com.mediaarchive.animation.gallery.model.GalleryPARAM;
import com.mediaarchive.animation.gallery.model.GalleryRecPicsVO;

@Service
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private GalleryMapper galleryMapper;
	
	//1번 로그인 성공, 2번 아이디 없음, 3번 비번 틀림
	public int login(UserPARAM param) {
		if(param.getUser_id().equals("")) { return Const.NO_ID; }
		
		UserDMI dbUser = mapper.selUser(param);		
		if(dbUser == null) { return Const.NO_ID; }
		//암호화된 비밀번호
		String cryptPw = SecurityUtils.getEncrypt(param.getUser_pw(), dbUser.getUser_salt());
		if(!cryptPw.equals(dbUser.getUser_pw())) { return Const.NO_PW; }
		
		param.setI_user(dbUser.getI_user());
		param.setUser_pw(null);
		param.setUser_nm(dbUser.getUser_nm());
		param.setUser_profile(dbUser.getUser_profile());
		return Const.SUCCESS;		
	}
	
	public int join(UserVO param) {
		String pw = param.getUser_pw();
		String salt = SecurityUtils.generateSalt();
		String cryptPw = SecurityUtils.getEncrypt(pw, salt);
		
		param.setUser_salt(salt);
		param.setUser_pw(cryptPw);
		
		return mapper.insUser(param);
	}
	//ajax통신 비동기형으로 
	public int ajaxToggleFavorite(UserPARAM param) {//i_user, i_rest, proc_type
		switch(param.getProc_type()) {
		case "ins":
			return mapper.insFavorite(param);
		case "del":
			return mapper.delFavorite(param);
		}
		return 0;
	}
	//자기가 집은 작품을 리스트로 조회함.
	public List<UserDMI> selFavoriteList(UserPARAM param) {	
		List<UserDMI> list = mapper.selFavoriteList(param);
		//찜한걸 화면에 뿌리기
		for(UserDMI vo : list) {
			GalleryPARAM param2 = new GalleryPARAM();
			param2.setI_gallery(vo.getI_gallery());
			
			List<GalleryRecPicsVO> eachRecMenuList = galleryMapper.sel(param2);
			//
			vo.setGallery_List(eachRecMenuList);
		}
		
		return list;
	}
}





















