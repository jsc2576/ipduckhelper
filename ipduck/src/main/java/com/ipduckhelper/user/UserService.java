package com.ipduckhelper.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Integer Crt_Mem(User entity) throws Exception{
		String file_nm = "";
		
		//프로필 사진을 넣지 않은 경우
		if(entity.getUpload_img().isEmpty()) {
			file_nm = "base_profile"; // 기본 프로필로 설정
		}
		else {
			// 파일 저장
			file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getUserProfilePath());
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
		
		if(!entity.getUpload_img().isEmpty()) { // 새로운 파일이 올라올 경우
			User file_info = userRepository.File_Info(entity.getMem_id()); // base_profile인지 비교하기 위해서 가져옴
			
			if(file_info.getFile_nm() != "base_profile") { // 기본 프로필이 아니면
				CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm()); // 프로필 삭제 					
			}
			
			// 파일 추가
			entity.setFile_nm(CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getUserProfilePath()));
			entity.setFile_path(CommonUtil.getUserProfilePath()); // 프로필 경로
		}
		
		entity.setPwd_key(CommonUtil.getPwdKey());	// 비밀번호 업데이트 용 키
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
