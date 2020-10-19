package com.mediaarchive.animation.gallery.model;

public class GalleryPARAM extends GalleryVO{
	//게시글에 보이는 항목중에 뷰에서 보이는것들
	private int seq;//1 키값
	private String gallery_nm;//
	private int gallery_category;
	//섬네일
	private int i_user;//등록한 사람
	private String user_nm;//등록한 사람의 닉네임
	private String user_account;//계정명
	//등록한 사람의 프로필사진
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getGallery_nm() {
		return gallery_nm;
	}
	public void setGallery_nm(String gallery_nm) {
		this.gallery_nm = gallery_nm;
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
	public String getUser_nm() {
		return user_nm;
	}
	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
}
