package com.ipduckhelper.sche;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheRepository {

	@Autowired
	SqlSession sqlSession;
	
	public Integer Crt_Sche(Sche entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.sche.crt_sche", entity);
	}
	
	public List<Sche> Srch_Sche_List(Sche entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.sche.srch_sche_list", entity);
	}
	
	public Integer Fix_Sche(Sche entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.sche.fix_sche", entity);
	}
	
	public Integer Del_Sche(Integer sche_idx) throws Exception{
		return sqlSession.delete("com.ipduckhelper.sche.del_sche", sche_idx);
	}
}
