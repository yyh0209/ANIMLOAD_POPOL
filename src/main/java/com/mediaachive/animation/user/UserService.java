package com.mediaachive.animation.user;

import com.mediaachive.animation.user.model.UserPARAM;
public class UserService {
	public int ajaxToggleFavorite(UserPARAM param) { //i_rest,i_user,proc_type
		System.out.println("진입!");
		switch(param.getProc_type()) {
		case "ins":
			return mapper.insFavorite(param);
		case "del":
			return mapper.delFavorite(param);
		}
		return 0;
	}
}
