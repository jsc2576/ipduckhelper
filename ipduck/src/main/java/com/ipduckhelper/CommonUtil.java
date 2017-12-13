package com.ipduckhelper;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.web.multipart.MultipartFile;

public class CommonUtil {

	private final static String pwd_key = "문자열1234";
	private final static Integer file_random_length = 12; // 파일 뒤에 랜덤으로 붙는 숫자 자리수
	private final static String user_profile_path = "/"; //유저 프로필 사진 저장 경로
	private final static String star_profile_path = "/"; //연예인 프로필 사진 저장 경로
	private final static String cmpy_profile_path = "/"; // 기획사 대표 프로필 사진 저장 경로
	private final static String meme_path = "/";
	private final static String Post_img_path = "/";
	private final static String base_profile_nm = "base_profile.jpg";
	
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
	
	public static boolean Delete_Image(String path, String file_name) throws Exception{
		String file_path = Paths.get(path, file_name).toString();
		
		File profile = new File(file_path);
		
		if(profile.exists()) {
			profile.delete();
			return true;
		}
		else return false;
	}
	
	/**
	 * 파일 업로드
	 * @param image
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static String Upload_Image(MultipartFile image, String path) throws Exception{
		
		String file_nm = image.getOriginalFilename().substring(0, image.getOriginalFilename().lastIndexOf(".")) + "_" + CommonUtil.getDate() + "_" + CommonUtil.getRandom(CommonUtil.getFileRandomLength()) + image.getOriginalFilename().substring(image.getOriginalFilename().lastIndexOf("."), image.getOriginalFilename().length());
		String file_path = Paths.get(".", file_nm).toString();
		
		// 파일 생성
		File save_profile = new File(file_path);
		
		/*
		 * 파일 저장
		 */
		FileOutputStream fileOutputStream = new FileOutputStream(save_profile);
		BufferedOutputStream stream = new BufferedOutputStream(fileOutputStream);
        stream.write(image.getBytes());
        stream.close();
	
        return file_nm;
	}

	public static String getPwdKey() {
		return pwd_key;
	}
	
	public static Integer getFileRandomLength() {
		return file_random_length;
	}
	
	public static String getUserProfilePath() {
		return user_profile_path;
	}
	
	public static String getStarProfilePath() {
		return star_profile_path;
	}

	public static String getCmpyProfilePath() {
		return cmpy_profile_path;
	}

	public static String getMemePath() {
		return meme_path;
	}

	public static String getPostImgPath() {
		return Post_img_path;
	}

	public static String getBaseProfileNm() {
		return base_profile_nm;
	}
}
