package com.ipduckhelper.cmnt;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CmntRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public Integer Crt_Cmnt(Cmnt entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.cmnt.crt_cmnt", entity);
	}
	
	public List<Cmnt> Srch_Cmnt_List(Cmnt entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.cmnt.srch_cmnt_list", entity);
	}
	
	public Integer Fix_Cmnt(Cmnt entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.cmnt.fix_cmnt", entity);
	}
	
	public Integer Del_Cmnt(Cmnt entity) throws Exception{
		return sqlSession.delete("com.ipduckhelper.cmnt.del_cmnt", entity);
	}
}
