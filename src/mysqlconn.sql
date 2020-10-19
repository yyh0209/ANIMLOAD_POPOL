create table t_user(
	i_user UNSIGNED int not null primary key auto_increment,--user의 key값
	user_nm varchar(10) not null,--이름
	user_id varchar(20) not null,--아이디
	user_pw varchar(16)not null,--패스워드
	salt varchar(30)not null,--패스워드암호화
	profile_img varchar(50)not null,--기본프로필사진
	r_dt datetime not null, --현재시간
	m_dt datetime not null--수정날짜
);
create table t_arc(
	i_arc int not null primary key auto_increment--등록된 작품
	arc_nm varchar(20)not null,--이름
	arc_cnt varchar(100)--설명
	arc_category UNSIGNED int(10)  not null,--장르별
	
	i_user --나의 pk값
	--조회수
	--올린시간
	--수정날짜
);
create table t_RecArc(
	--사용자가 찜한 작품의 키값
	--제목
	--사진
	--설명
);