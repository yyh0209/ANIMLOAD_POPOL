package com.koreanindie.animation.animboard.model;

public class AnimRecVO {
	private int i_anim; //작품의 키값
	private int seq; //
	private String anim_nm; //작품 이름 
	private String anim_pic; //작품 섬네일
	private String anim_comment; //작품 설명
	
	private int i_user; //접근하는 유저

	public int getI_anim() {
		return i_anim;
	}

	public void setI_anim(int i_anim) {
		this.i_anim = i_anim;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getAnim_nm() {
		return anim_nm;
	}

	public void setAnim_nm(String anim_nm) {
		this.anim_nm = anim_nm;
	}

	public String getAnim_pic() {
		return anim_pic;
	}

	public void setAnim_pic(String anim_pic) {
		this.anim_pic = anim_pic;
	}

	public String getAnim_comment() {
		return anim_comment;
	}

	public void setAnim_comment(String anim_comment) {
		this.anim_comment = anim_comment;
	}

	public int getI_user() {
		return i_user;
	}

	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
	
}
