package com.ipduckhelper.user;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ipduckhelper.CommonUtil;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	/**
	 * 유저 회원가입
	 * @param entity
	 * @param profile_img
	 * @return
	 * @throws Exception
	 */
	public Integer Crt_Mem(User entity, MultipartFile profile_img) throws Exception{
		String file_nm = "";
		
		//프로필 사진을 넣지 않은 경우
		if(profile_img == null) {
			file_nm = "base_profile"; // 기본 프로필로 설정
		}
		else {
			//파일 메타 데이터 생성
			file_nm = profile_img.getOriginalFilename() + "_" + CommonUtil.getDate() + "_" + CommonUtil.getRandom(CommonUtil.getFileRandomLength());
			String file_path = Paths.get(CommonUtil.getUserProfilePath(), file_nm).toString();
			
			// 파일 생성
			File save_profile = new File(file_path);
			
			/*
			 * 파일 저장
			 */
			FileOutputStream fileOutputStream = new FileOutputStream(save_profile);
			BufferedOutputStream stream = new BufferedOutputStream(fileOutputStream);
	        stream.write(profile_img.getBytes());
	        stream.close();
		}
        
        entity.setFile_nm(file_nm); // 저장된 파일 이름
        entity.setFile_path(CommonUtil.getUserProfilePath()); // 저장된 경로
        entity.setPwd_key(CommonUtil.getPwdKey()); // 암호화 키
        
		return userRepository.Crt_Mem(entity);
	}
	
	
	
	public List<User> Srch_Mem_List(User entity) throws Exception{
		return userRepository.Srch_Mem_List(entity);
	}
	
	public User Srch_Mem(User entity) throws Exception{
		return userRepository.Srch_Mem(entity);
	}
	
	public Integer Fix_Mem(User entity) throws Exception{
		entity.setPwd_key(CommonUtil.getPwdKey());
		return userRepository.Fix_Mem(entity);
	}
	
	public Integer Del_Mem(User entity) throws Exception{
		return userRepository.Del_Mem(entity);
	}
	
	public Integer Acvt_Mem(User entity) throws Exception{
		return userRepository.Acvt_Mem(entity);
	}
	
	public User Login_Mem(User entity) throws Exception{
		entity.setPwd_key(CommonUtil.getPwdKey());
		return userRepository.Login_Mem(entity);
	}
}
