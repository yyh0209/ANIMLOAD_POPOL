package com.mediaarchive.animation.gallery.model;

//작품의 정보값들
public class GalleryVO {
	private int i_gallery; //사진 섬네일속 키값 회원정보가 가질수있다.
	private String gallery_nm;//사진파일의 이름;
	private String gallery_cmt;//작품 설명
	private String gallery_mktool;//사용툴
	private String gallery_pic; //사진파일
	private int gallery_category;//작품의 장르별 키값
	private int i_user;//올린 사람의 키값
	private int user_hits; //로그인 한사람들의 방문횟수
	
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
	public String getGallery_mktool() {
		return gallery_mktool;
	}
	public void setGallery_mktool(String gallery_mktool) {
		this.gallery_mktool = gallery_mktool;
	}
	public int getGallery_category() {
		return gallery_category;
	}
	public void setGallery_category(int gallery_category) {
		this.gallery_category = gallery_category;
	}
	public int getI_user() {
		return i_user;
	}
	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
	
	
}
