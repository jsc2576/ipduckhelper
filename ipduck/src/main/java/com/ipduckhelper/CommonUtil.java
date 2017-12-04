package com.ipduckhelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CommonUtil {

	private final static String pwd_key = "문자열1234";
	private final static Integer file_random_length = 12; // 파일 뒤에 랜덤으로 붙는 숫자 자리수
	private final static String user_profile_path = "./profile"; //유저 프로필 사진 저장 경로
	
	public static String getPwdKey() {
		return pwd_key;
	}
	
	public static Integer getFileRandomLength() {
		return file_random_length;
	}
	
	public static String getUserProfilePath() {
		return user_profile_path;
	}
	
	
	public static String getDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhddssSSS");
		return dateFormat.format(new Date());
	}
	
	public static String getRandom(int length) {
		String rand_str = "";
		Random rand = new Random();
		
		for(int i=0; i<length; i++) {
			rand_str += rand.nextInt(10);
		}
		
		return rand_str;
	}
}
