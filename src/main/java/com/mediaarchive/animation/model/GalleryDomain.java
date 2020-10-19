package com.mediaarchive.animation.model;

import com.mediaarchive.animation.gallery.model.GalleryVO;

public class GalleryDomain extends GalleryVO{
	private String gallery_nm;//사진파일의 이름;
	private int cntHits; //조회수
	private int cntFavorite; //좋아요수
	private String gallery_category_nm; //장르이름
	//
	public String getGallery_nm() {
		return gallery_nm;
	}
	public void setGallery_nm(String gallery_nm) {
		this.gallery_nm = gallery_nm;
	}
	public int getCntHits() {
		return cntHits;
	}
	public void setCntHits(int cntHits) {
		this.cntHits = cntHits;
	}
	public int getCntFavorite() {
		return cntFavorite;
	}
	public void setCntFavorite(int cntFavorite) {
		this.cntFavorite = cntFavorite;
	}
	public String getGallery_category_nm() {
		return gallery_category_nm;
	}
	public void setGallery_category_nm(String gallery_category_nm) {
		this.gallery_category_nm = gallery_category_nm;
	}
	
}
