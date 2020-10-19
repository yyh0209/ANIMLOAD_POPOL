package com.mediaarchive.animation.gallery.model;
//마음함에 담은 그림의 정보값과 주체

public class GalleryRecPicsVO {
	private int i_gallery; //작품의 키값
	private int seq;
	private int gallery_category;//작품의 장르별 키값
	private String gallery_cmt;//작품 설명
	private String gallery_nm;//사진파일의 이름;
	private String gallery_pic; //사진파일
	
	private int i_user;//올린 사람의 키값

	public int getI_gallery() {
		return i_gallery;
	}

	public void setI_gallery(int i_gallery) {
		this.i_gallery = i_gallery;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getGallery_category() {
		return gallery_category;
	}

	public void setGallery_category(int gallery_category) {
		this.gallery_category = gallery_category;
	}

	public String getGallery_cmt() {
		return gallery_cmt;
	}

	public void setGallery_cmt(String gallery_cmt) {
		this.gallery_cmt = gallery_cmt;
	}

	public String getGallery_nm() {
		return gallery_nm;
	}

	public void setGallery_nm(String gallery_nm) {
		this.gallery_nm = gallery_nm;
	}

	public String getGallery_pic() {
		return gallery_pic;
	}

	public void setGallery_pic(String gallery_pic) {
		this.gallery_pic = gallery_pic;
	}

	public int getI_user() {
		return i_user;
	}

	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
}
