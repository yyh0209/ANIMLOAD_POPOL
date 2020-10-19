package com.mediaachive.animation.archive.model;

// 아티스트가 개인적으로 추천하는 작품
//메인 계정 홈피에 올릴수있다.
//사용권한은 오직 다른 사람이 할수있다.
public class ArcRecMediaVO {
	
	private int i_arc; //작품의 키값
	private int seq; 
	private String arc_title; //메뉴이름
	private int menu_price; //가격대
	private String menu_pic; //사진
	
	private int i_user; //추천한 회원의 키값

	
	
}
