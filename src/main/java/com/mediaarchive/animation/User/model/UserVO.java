package com.mediaarchive.animation.User.model;

public class UserVO {
	private int i_user;//키값
	private String user_id;//아이디
	private String user_pw;//비밀번호
	private String user_salt;//비밀본호 암호화
	private String user_nm;//이름
	private String user_profile; //내 계정의 프로필사진
	private String user_account;//계정명
	//로그인때 사용
	private String user_cmt;//자기설명 나를 설명하는 텍스트
	private String user_media;//사진파일
	private String user_theme;//내계정상단에 올릴  테마사진
	private String user_crtdt;// 업로드한날짜 create
	private String user_upddt;//사진을수정날짜 update
	
	public int getI_user() {
		return i_user;
	}
	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	public String getUser_salt() {
		return user_salt;
	}
	public void setUser_salt(String user_salt) {
		this.user_salt = user_salt;
	}
	public String getUser_nm() {
		return user_nm;
	}
	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}
	
	public String getUser_profile() {
		return user_profile;
	}
	public void setUser_profile(String user_profile) {
		this.user_profile = user_profile;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_cmt() {
		return user_cmt;
	}
	public void setUser_cmt(String user_cmt) {
		this.user_cmt = user_cmt;
	}
	
	public String getUser_media() {
		return user_media;
	}
	public void setUser_media(String user_media) {
		this.user_media = user_media;
	}
	public String getUser_theme() {
		return user_theme;
	}
	public void setUser_theme(String user_theme) {
		this.user_theme = user_theme;
	}
	public String getUser_crtdt() {
		return user_crtdt;
	}
	public void setUser_crtdt(String user_crtdt) {
		this.user_crtdt = user_crtdt;
	}
	public String getUser_upddt() {
		return user_upddt;
	}
	public void setUser_upddt(String user_upddt) {
		this.user_upddt = user_upddt;
	}

}