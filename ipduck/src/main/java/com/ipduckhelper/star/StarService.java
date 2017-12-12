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
			file_nm = CommonUtil.getBaseProfileNm();
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
		
		List<Star> result = starRepository.Srch_Star_List(entity);
		
		for(int i=0; i<result.size(); i++) {
			if(result.get(i).getFile_nm().equals(null) || result.get(i).getFile_nm().equals("")) {
				result.get(i).setFile_path(CommonUtil.getStarProfilePath());
				result.get(i).setFile_nm(CommonUtil.getBaseProfileNm());
			}
		}
		
		return result;
	}
	
	public List<Star> Srch_Star_Tag_List(Star entity) throws Exception{
		
		List<Star> result = starRepository.Srch_Star_Tag_List(entity);
		
		for(int i=0; i<result.size(); i++) {
			if(result.get(i).getFile_nm().equals(null) || result.get(i).getFile_nm().equals("")) {
				result.get(i).setFile_path(CommonUtil.getStarProfilePath());
				result.get(i).setFile_nm(CommonUtil.getBaseProfileNm());
			}
		}
		
		return result;
	}

	public List<Star> Srch_Grp_Names(Star entity) throws Exception{
		return starRepository.Srch_Grp_Names(entity);
	}
	
	public List<Star> Srch_Grp_List(Star entity) throws Exception{
		return starRepository.Srch_Grp_List(entity);
	}
	
	public Star Srch_Star(Star entity) throws Exception{
		return starRepository.Srch_Star(entity);
	}
	
	public Star Srch_Grp(Star entity) throws Exception{
		return starRepository.Srch_Grp(entity);
	}
	
	public Integer Fix_Star(Star entity) throws Exception{
		
		if(!entity.getUpload_img().isEmpty()) {
			Star file_info = starRepository.Star_File_Info(entity.getStar_mem_idx());
			if(file_info.getFile_nm() != CommonUtil.getBaseProfileNm() && file_info.getFile_nm() != "" && file_info.getFile_nm() != null) {
				CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm());
			}
					
			String file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getStarProfilePath());
			entity.setFile_nm(file_nm);
			entity.setFile_path(CommonUtil.getStarProfilePath());
			
		}
		
		return starRepository.Fix_Star(entity);
	}
	
	public Integer Fix_Grp(Star entity) throws Exception{
		
		if(!entity.getUpload_img().isEmpty()) {
			Star file_info = starRepository.Grp_File_Info(entity.getGrp_idx());
			
			if(file_info.getFile_nm() != CommonUtil.getBaseProfileNm() && file_info.getFile_nm() != "" && file_info.getFile_nm() != null) {
				CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm());
			}	
			String file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getStarProfilePath());
			entity.setFile_nm(file_nm);
			entity.setFile_path(CommonUtil.getStarProfilePath());
		}
		
		return starRepository.Fix_Grp(entity);
	}
	
	public Integer Del_Star(Integer star_mem_idx) throws Exception{
		return starRepository.Del_Star(star_mem_idx);
	}
	
	public Integer Del_Grp(Integer grp_idx) throws Exception{
		return starRepository.Del_Grp(grp_idx);
	}
	
	public Integer Like_Star(Star entity) throws Exception{
		return starRepository.Like_Star(entity);
	}
	
	public Integer Add_Tag_Star(Star entity) throws Exception{
		return starRepository.Add_Tag_Star(entity);
	}
	
	public Integer Del_Tag_Star(Star entity) throws Exception{
		return starRepository.Del_Tag_Star(entity);
	}
}
