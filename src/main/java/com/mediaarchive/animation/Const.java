package com.mediaarchive.animation;

public class Const {
	public static String realpath = null; // 문자열 경로
	public static final String TEMPLATE = "template"; //템플릿으로
	public static final String VIEW = "view";//뷰
	public static final String TITLE = "title";//제목
	public static final String CSS = "css";//css
	
	public static final String LOGIN_USER = "loginUser";//회원
	public static final String CURRENT_REST_READ_IP = "currentRestReadIp_";//최근에 방문한 회원의 주소IP
	
	//
	public static final int FAIL = 0; //실패하면 0을 반환
	public static final int SUCCESS = 1;//성공 하면 1을 반환
	public static final int NO_ID = 2;//아이디 실패 2를 반환
	public static final int NO_PW = 3;//비밀번호 실패
}