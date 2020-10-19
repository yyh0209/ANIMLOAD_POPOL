package com.mediaachive.animation.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.mediaachive.animation.user.model.UserDMI;
import com.mediaachive.animation.user.model.UserPARAM;
import com.mediaachive.animation.user.model.UserVO;



@Mapper
public interface UserMapper {
	
	//나중에 리턴타입도 바꿀수있다.
	//select.만 int타입이 아닌 리턴타입이다.
	//변수명과 칼럼명과 매칭이 되야된다.
	//매장등록
	int insUser(UserVO p); //
	int insFavorite(UserPARAM param);
	UserDMI selUser(UserPARAM p);
	List<UserDMI> selFavoriteList(UserPARAM param);
	
	int delFavorite(UserPARAM param);
}
