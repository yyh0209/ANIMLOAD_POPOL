package com.mediaachive.animation.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class UserMapper {
	//나중에 리턴타입도 바꿀수있다.
	//select.만 int타입이 아닌 리턴타입이다.
	//변수명과 칼럼명과 매칭이 되야된다.
	//매장등록
	int insUser(UserVO p);
	int insFavorite(UserPARAM param);
	UserDMI selUser(UserPARAM p);
	int delFavorite(UserPARAM param);
}
