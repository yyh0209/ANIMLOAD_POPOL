package com.koreanindie.animation.animboard.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class AnimVO {
	//
	private List<MultipartFile> anim_pic; //작품의 파일
	private int i_anim; //작품의 pk값.
	private String anim_nm;//작품의 이름
	private String anim_path;//작품의 경로
	//작품의 업로드날짜
	private int i_user; //유저의 접근 pk값 
	private String anim_hits;//작품의 조회수
	private int anim_rec;//유저의 좋아요수
}
