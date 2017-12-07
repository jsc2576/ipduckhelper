package com.ipduckhelper.cmnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmntService {

	@Autowired
	CmntRepository cmntRepository;
	
	public Integer Crt_Cmnt(Cmnt entity) throws Exception{
		return cmntRepository.Crt_Cmnt(entity);
	}
	
	public List<Cmnt> Srch_Cmnt_list(Cmnt entity) throws Exception{
		return cmntRepository.Srch_Cmnt_List(entity);
	}
	
	public Integer Fix_Cmnt(Cmnt entity) throws Exception{
		return cmntRepository.Fix_Cmnt(entity);
	}
	
	public Integer Del_Cmnt(Integer cmnt_idx) throws Exception{
		return cmntRepository.Del_Cmnt(cmnt_idx);
	}
}
