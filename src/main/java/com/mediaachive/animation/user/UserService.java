package com.mediaachive.animation.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaachive.animation.Const;
import com.mediaachive.animation.archive.ArcMapper;
import com.mediaachive.animation.user.model.UserDMI;
import com.mediaachive.animation.user.model.UserPARAM;


@Service
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private ArcMapper arcMapper;
	public int login(UserPARAM param) {
		if(param.getUser_id().equals("")) { return Const.NO_ID;} //아이디가 빈칸일떼
		UserDMI dbUser = mapper.selUser(param); 
		
		return Const.SUCCESS;
			
	}
	
	public int ajaxToggleFavorite(UserPARAM param) { //i_rest,i_user,proc_type
		System.out.println("진입!");
		switch(param.getProc_type()) {
		case "ins":
			return mapper.insFavorite(param); //식당이ㅔ 좋아요누르기
		case "del":
			return mapper.delFavorite(param);
		}
		return 0;
	}
}
