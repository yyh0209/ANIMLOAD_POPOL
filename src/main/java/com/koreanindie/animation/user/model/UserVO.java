package com.koreanindie.animation.user.model;

/*회원 정보!!*/
public class UserVO {
	private int i_user;
	private String user_id; //아이디
	private String user_pw; //비밀번호 보안에 중요함
	private String user_Profile_pic; //프사.
	private String user_nm; //회원의 이름 다른 사용자가 검색했을때 적용됨
	private String salt; //비밀번호를 암호화 하기좋다.
	private String user_account; //계정 연동을 하기 위한 홈페이지 구글연동
	private String user_art; //회원이 소유하고있는 파일단위의 정보
	//회원의 키값 :유저를 crud하는 수단.
}
