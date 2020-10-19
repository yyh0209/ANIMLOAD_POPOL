package com.mediaarchive.animation.gallery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaarchive.animation.User.UserMapper;

@Service
public class GalleryService {
	@Autowired
	private GalleryMapper galleryMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	
}
