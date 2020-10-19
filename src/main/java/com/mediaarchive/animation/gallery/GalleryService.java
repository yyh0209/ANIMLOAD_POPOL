package com.mediaarchive.animation.gallery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mediaarchive.animation.Const;
import com.mediaarchive.animation.User.UserMapper;
import com.mediaarchive.animation.gallery.model.GalleryDMI;
import com.mediaarchive.animation.gallery.model.GalleryPARAM;
import com.mediaarchive.animation.model.CommonMapper;
import com.oreilly.servlet.MultipartRequest;

@Service
public class GalleryService {
	@Autowired
	private GalleryMapper galleryMapper;
	
	@Autowired
	private CommonMapper cMapper;
	
	//메인화면에 작가와 작품,좋아요,조회수를 띄운다. dmi
	public List<GalleryDMI> selGalleryList(GalleryPARAM param){
		return galleryMapper.selGalleryList(param);
	}
	//내가 추천하는 작품들을 올려둔다.
	public int insGalleryPic(MultipartHttpServletRequest mReq) {
		
		if(_authFail(i_gallery,i_user)) {
			return Const.FAIL;			
		}
		
	}
	//검색기능을 구현
	//조회수를 올리는 기능
	//좋아요를 뷰로 보여준다.
	//장르를 보여준다.
	
	//하나의 작업에 동시작업을한다. 삭제기능으로
	@Transactional
	public void delGalleryTran(GalleryPARAM param) {
		galleryMapper.delGalleryRecPic(param);
	}
	
	//
	private boolean _aurhFail(int i_gallery,int i_user) {
		GalleryPARAM param = new GalleryPARAM();
		param.setI_gallery(i_gallery);
		int dbI_user =galleryMapper.selGalleryChkUser(i_gallery);
		
		if(i_user!= dbI_user) {
			return true;
		}
		return false;
	}
}
