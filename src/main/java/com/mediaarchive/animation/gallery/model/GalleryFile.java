package com.mediaarchive.animation.gallery.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class GalleryFile implements Serializable{
	//시리얼 번호를 붙이면 원래 사진 파일의 이름이 임의 숫자로 바꾼다.
	private static final long serialVersionUDI = 1L;
	
	private int i_gallery;//작품의 키값
	private List<MultipartFile> gallery_pic;//갤러리 사진파일들.

	public int getI_gallery() {
		return i_gallery;
	}
	public void setI_gallery(int i_gallery) {
		this.i_gallery = i_gallery;
	}
	public List<MultipartFile> getGallery_pic() {
		return gallery_pic;
	}
	public void setGallery_pic(List<MultipartFile> gallery_pic) {
		this.gallery_pic = gallery_pic;
	}
	public static long getSerialversionudi() {
		return serialVersionUDI;
	}

	
}
