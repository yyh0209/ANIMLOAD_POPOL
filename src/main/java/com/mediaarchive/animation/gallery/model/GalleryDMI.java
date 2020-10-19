package com.mediaarchive.animation.gallery.model;

//작품의 도메인창.
public class GalleryDMI extends GalleryVO{
	private String gallery_category_nm;//장르별이름
	private String user_nm;//사용자이름
	private int cnt_favorite;//추천수 누르면 오른다 한번더누르면 취소
	private int is_favorite; //좋아요를 해제
	
	
	public String getGallery_category_nm() {
		return gallery_category_nm;
	}
	public void setGallery_category_nm(String gallery_category_nm) {
		this.gallery_category_nm = gallery_category_nm;
	}
	public String getUser_nm() {
		return user_nm;
	}
	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	public int getCnt_favorite() {
		return cnt_favorite;
	}
	public void setCnt_favorite(int cnt_favorite) {
		this.cnt_favorite = cnt_favorite;
	}
	public int getIs_favorite() {
		return is_favorite;
	}
	public void setIs_favorite(int is_favorite) {
		this.is_favorite = is_favorite;
	}
	
	
	
}
