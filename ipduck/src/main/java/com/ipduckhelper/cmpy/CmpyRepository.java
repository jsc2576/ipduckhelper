package com.ipduckhelper.cmpy;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CmpyRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class})
	public Integer Crt_Cmpy(Cmpy entity) throws Exception{
		sqlSession.insert("com.ipduckhelper.cmpy.crt_cmpy_first", entity);
		return sqlSession.insert("com.ipduckhelper.cmpy.crt_cmpy_second", entity);
	}
	
	public List<Cmpy> Srch_Cmpy_List(Cmpy entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.cmpy.srch_cmpy_list", entity);
	}
	
	public Cmpy Srch_Cmpy(Cmpy entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.cmpy.srch_cmpy", entity);
	}
	
	public Integer Fix_Cmpy(Cmpy entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.cmpy.fix_cmpy", entity);
	}
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class})
	public Integer Del_Cmpy(String cmpy_nm) throws Exception{
		sqlSession.delete("com.ipduckhelper.cmpy.del_cmpy_profile", cmpy_nm);
		return sqlSession.delete("com.ipduckhelper.cmpy.del_cmpy", cmpy_nm);
	}
	
	public Cmpy File_Info(String cmpy_nm) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.cmpy.file_info", cmpy_nm);
	}
}
