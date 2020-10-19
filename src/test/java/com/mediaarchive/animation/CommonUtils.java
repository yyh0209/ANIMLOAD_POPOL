package com.mediaarchive.animation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

public class CommonUtils {
	public static int parseStringToInt(String str) {
		try {
			return Integer.parseInt(str); //정수객체 문자열을 숫자로 바꿈 문자열로 입력된 숫자를 정수로 바꿔서 
		} catch(Exception e) {}		
		return 0;
	}
	
	public static double parseStringToDouble(String str) {
		try {
			return Double.parseDouble(str); //double형 get한테 던져질 함수
		} catch(Exception e) {}		
		return 0;
	}
	
	public static int getIntParameter(String key, HttpServletRequest request) {
		return parseStringToInt(request.getParameter(key));
	}
	
	public static int getIntParameter(String key, MultipartRequest request) {
		return parseStringToInt(request.getParameter(key)); //키값을 
	}
	
	public static double getDoubleParameter(String key, HttpServletRequest request) {
		return parseStringToDouble(request.getParameter(key));
	}
}
