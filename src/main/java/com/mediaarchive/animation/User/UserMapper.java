package com.mediaarchive.animation.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mediaarchive.animation.User.model.UserDMI;
import com.mediaarchive.animation.User.model.UserPARAM;
import com.mediaarchive.animation.User.model.UserVO;


@Mapper
public interface UserMapper {
	int insUser(UserVO param); //아이디,패스워드,패스워드+salt,이름
	int insFavorite(UserPARAM param); //내가 추천하는 그림 삽입
	UserDMI selUser(UserPARAM param); 
	//t_user의 값들을 끌어오기
	List<UserDMI> selFavoriteList(UserPARAM param);
	//내가 추천하는 작품의 테이블과 작품의 정보중 키값을 조인
	int delFavorite(UserPARAM param);
	//내 마음찍은 그림을 삭제하기
}






