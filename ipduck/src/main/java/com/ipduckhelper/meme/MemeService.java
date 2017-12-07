package com.ipduckhelper.meme;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipduckhelper.CommonUtil;

@Service
public class MemeService {
	
	@Autowired
	MemeRepository memeRepository;
	
	public Integer Crt_Mm(Meme entity) throws Exception{
		if(entity.getUpload_img().isEmpty()) {
			return -1;
		}
		
		String file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getMemePath());
		
		entity.setFile_nm(file_nm);
		entity.setFile_path(CommonUtil.getMemePath());
		
		return memeRepository.Crt_Mm(entity);
	}
	
	public List<Meme> Srch_Mm_Star_List(Meme entity) throws Exception{
		return memeRepository.Srch_Mm_Star_List(entity);
	}
	
	public List<Meme> Srch_Mm_Tag_List(Meme entity) throws Exception{
		return memeRepository.Srch_Mm_Tag_List(entity);
	}
	
	public Integer Fix_Mm(Meme entity) throws Exception{
		
		if(entity.getUpload_img().isEmpty()) {
			return -1;
		}
		
		Meme file_info = memeRepository.File_Info(entity.getMm_idx());
		CommonUtil.Delete_Image(file_info.getFile_path(), file_info.getFile_nm());
		
		String file_nm = CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getMemePath());
		
		entity.setFile_nm(file_nm);
		entity.setFile_path(CommonUtil.getMemePath());
		
		return memeRepository.Fix_Mm(entity);
	}
	
	public Integer Del_Mm(Integer mm_idx) throws Exception{
		return memeRepository.Del_Mm(mm_idx);
	}
	
	public Integer Add_Tag_Mm(Meme entity) throws Exception{
		return memeRepository.Add_Tag_Mm(entity);
	}
	
	public Integer Del_Tag_Mm(Meme entity) throws Exception{
		return memeRepository.Del_Tag_Mm(entity);
	}
}
