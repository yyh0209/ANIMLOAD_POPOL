00package com.mediaarchive.animation.User.model;

//1차 주소를 거치면 사용할수있는 값
public class UserPARAM extends UserVO {
	private String msg;
	private int i_gallery;//작품
	private String proc_type;
	//
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getI_gallery() {
		return i_gallery;
	}
	public void setI_gallery(int i_gallery) {
		this.i_gallery = i_gallery;
	}
	public String getProc_type() {
		return proc_type;
	}
	public void setProc_type(String proc_type) {
		this.proc_type = proc_type;
	}
	
}
