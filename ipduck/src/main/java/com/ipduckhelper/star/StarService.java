package com.ipduckhelper.star;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipduckhelper.CommonUtil;

@Service
public class StarService {

	@Autowired
	StarRepository starRepository;
	
	public Integer Crt_Star_and_Grp(Star entity, boolean star_check) throws Exception{
		
		String file_nm = "";
		if(entity.getUpload_img().isEmpty()) {
			file_nm = "base_profile";
		}
		else {
			file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getStarProfilePath());
		}
		
		entity.setFile_nm(file_nm); // 저장된 파일 이름
        entity.setFile_path(CommonUtil.getUserProfilePath()); // 저장된 경로
        
        if(star_check)
        	return starRepository.Crt_Star(entity);
        else
        	return starRepository.Crt_Grp(entity);
	}
	
	public List<Star> Srch_Star_List(Star entity) throws Exception{
		return starRepository.Srch_Star_List(entity);
	}
	
	public Star Srch_Star(Star entity) throws Exception{
		return starRepository.Srch_Star(entity);
	}
	
	public Star Srch_Grp(Star entity) throws Exception{
		return starRepository.Srch_Grp(entity);
	}
	
	public Integer Fix_Star(Star entity) throws Exception{
		
		Star file_info = starRepository.Star_File_Info(entity.getStar_mem_idx());
		
		if(file_info.getFile_nm() != "base_profile") {
			CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm());
		}
		
		String file_nm = "";
		if(entity.getUpload_img().isEmpty()) {
			file_nm = "base_profile";
		}
		else {
			file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getStarProfilePath());
		}
		
		entity.setFile_nm(file_nm);
		entity.setFile_path(CommonUtil.getStarProfilePath());
		
		return starRepository.Fix_Star(entity);
	}
	
	public Integer Fix_Grp(Star entity) throws Exception{
		Star file_info = starRepository.Grp_File_Info(entity.getGrp_idx());
		
		if(file_info.getFile_nm() != "base_profile") {
			CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm());
		}
		
		String file_nm = "";
		if(entity.getUpload_img().isEmpty()) {
			file_nm = "base_profile";
		}
		else {
			file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getStarProfilePath());
		}
		
		entity.setFile_nm(file_nm);
		entity.setFile_path(CommonUtil.getStarProfilePath());
		
		return starRepository.Fix_Grp(entity);
	}
	
	public Integer Del_Star(Star entity) throws Exception{
		return starRepository.Del_Star(entity);
	}
	
	public Integer Del_Grp(Star entity) throws Exception{
		return starRepository.Del_Grp(entity);
	}
	
	public Integer Like_Star(Star entity) throws Exception{
		return starRepository.Like_Star(entity);
	}
	
	public Integer Add_Tag_Star(Star entity) throws Exception{
		return starRepository.Add_Tag_Star(entity);
	}
}
