package com.mediaachive.animation.user.model;

import java.util.List;

import com.mediaachive.animation.archive.model.ArcRecMediaVO;

//내가 업로드할 작품.
//로그인한 상태에서 할수있는 권한들.
public class UserDMI extends UserVO{
	private int i_arc;	 //식당의 키값.
	private String arc_title; //식당이름
	private String arc_comment; //주소
	private List<ArcRecMediaVO> menuList; //회원이 미는 작품을 개인적으로 찜할수있다.
	
	
}
