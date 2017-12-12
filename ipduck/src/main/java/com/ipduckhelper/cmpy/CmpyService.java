package com.ipduckhelper.cmpy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipduckhelper.CommonUtil;

@Service
public class CmpyService {

	@Autowired
	CmpyRepository cmpyRepository;
	
	public Integer Crt_Cmpy(Cmpy entity) throws Exception{
		String file_nm = "";
		
		if(entity.getUpload_img().isEmpty()) {
			file_nm = "base_profile";
		}
		else {
			file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getCmpyProfilePath());
		}
		
		entity.setFile_nm(file_nm);
		entity.setFile_path(CommonUtil.getCmpyProfilePath());
		
		return cmpyRepository.Crt_Cmpy(entity);
	}

	public List<Cmpy> Srch_Cmpy_Names(Cmpy entity) throws Exception{
		return cmpyRepository.Srch_Cmpy_Names(entity);
	}

	public List<Cmpy> Srch_Cmpy_List(Cmpy entity) throws Exception{
		return cmpyRepository.Srch_Cmpy_List(entity);
	}
	
	public Cmpy Srch_Cmpy(Cmpy entity) throws Exception{
		return cmpyRepository.Srch_Cmpy(entity);
	}
	
	public Integer Fix_Cmpy(Cmpy entity) throws Exception{
		
		if(!entity.getUpload_img().isEmpty()) {
			Cmpy file_info = cmpyRepository.File_Info(entity.getCmpy_nm());
			
			if(file_info.getFile_nm() != "base_profile") {
				CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm());
			}
			String file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getCmpyProfilePath());	
			entity.setFile_nm(file_nm);
			entity.setFile_path(CommonUtil.getCmpyProfilePath());
		}
		
		return cmpyRepository.Fix_Cmpy(entity);
	}
	
	public Integer Del_Cmpy(String cmpy_nm) throws Exception{
		return cmpyRepository.Del_Cmpy(cmpy_nm);
	}
}
