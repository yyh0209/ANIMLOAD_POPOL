package com.mediaachive.animation.archive.model;

//화면상으로 보이는 작품의 제목들
//비회원이 접근할수있는 영역
public class ArchiveVO {
	private int i_arc; //작품의 키값
	private String arc_title; //제목
	private String arc_comment;
	private String arc_pic; //작품의 유형
	private String arc_thumbnail;//작품 섬네일
	private int rec_arc; //좋아요 수
	
	private int cd_category; //작품의 유형의 키값에 접근. 3d,2d혹은 모션캡쳐인지를 설정.
	private int i_user; //방문한사람
	private int hits; //조회
	
	
}
