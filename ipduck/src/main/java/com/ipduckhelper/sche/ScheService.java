package com.ipduckhelper.sche;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheService {
	
	@Autowired
	ScheRepository scheRepository;
	
	public Integer Crt_Sche(Sche entity) throws Exception{
		return scheRepository.Crt_Sche(entity);
	}
	
	public List<Sche> Srch_Sche_List(Sche entity) throws Exception{
		return scheRepository.Srch_Sche_List(entity);
	}
	
	public Integer Fix_Sche(Sche entity) throws Exception{
		return scheRepository.Fix_Sche(entity);
	}
	
	public Integer Del_Sche(Integer sche_idx) throws Exception{
		return scheRepository.Del_Sche(sche_idx);
	}
}
