package com.mediaarchive.animation.User.model;

import java.util.List;

import com.mediaarchive.animation.gallery.model.GalleryRecPicsVO;

//도메인 사용자가 찜한 식당을 등록.
public class UserDMI extends UserVO {
	private int i_gallery;	 //식당의 키값.
	private String gallery_nm; //식당이름
	private String gallery_cmt; //설명
	private int gallery_category;//작품의 장르별 키값 찜했을때 리스트를 종류별로 나누는역할
	private List<GalleryRecPicsVO> gallery_List; //메뉴들
		
	
	public int getI_gallery() {
		return i_gallery;
	}
	public void setI_gallery(int i_gallery) {
		this.i_gallery = i_gallery;
	}
	public String getGallery_nm() {
		return gallery_nm;
	}
	public void setGallery_nm(String gallery_nm) {
		this.gallery_nm = gallery_nm;
	}
	public String getGallery_cmt() {
		return gallery_cmt;
	}
	public void setGallery_cmt(String gallery_cmt) {
		this.gallery_cmt = gallery_cmt;
	}
	
	
	public int getGallery_category() {
		return gallery_category;
	}
	public void setGallery_category(int gallery_category) {
		this.gallery_category = gallery_category;
	}
	public List<GalleryRecPicsVO> getGallery_List() {
		return gallery_List;
	}
	public void setGallery_List(List<GalleryRecPicsVO> gallert_List) {
		this.gallery_List = gallert_List;
	}
}	
