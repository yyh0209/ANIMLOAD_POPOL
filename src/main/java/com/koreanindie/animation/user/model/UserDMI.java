package com.koreanindie.animation.user.model;

import java.util.List;

import com.koreanindie.animation.animboard.model.AnimRecVO;


public class UserDMI extends UserVO{
	private int i_anim;	 //작품의 키값
	private String anim_nm; //작품의 이름
	private String anim_coment; // 작품의 설명 
	private List<AnimRecVO> animRecList; //메뉴들 유저가 추천한 그림이나 영상.
	
	public int getI_anim() {
		return i_anim;
	}
	public void setI_anim(int i_anim) {
		this.i_anim = i_anim;
	}
	public String getAnim_nm() {
		return anim_nm;
	}
	public void setAnim_nm(String anim_nm) {
		this.anim_nm = anim_nm;
	}
	public String getAnim_coment() {
		return anim_coment;
	}
	public void setAnim_coment(String anim_coment) {
		this.anim_coment = anim_coment;
	}
	public List<AnimRecVO> getAnimRecList() {
		return animRecList;
	}
	public void setAnimRecList(List<AnimRecVO> animRecList) {
		this.animRecList = animRecList;
	}
	
	
}
