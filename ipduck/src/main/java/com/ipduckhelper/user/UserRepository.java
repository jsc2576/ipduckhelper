package com.ipduckhelper.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class})
	public Integer Crt_Mem(User entity) throws Exception{
		sqlSession.insert("com.ipduckhelper.user.crt_mem_first", entity);
		return sqlSession.insert("com.ipduckhelper.user.crt_mem_second", entity);
	}
	
	public List<User> Srch_Mem_List(User entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.user.srch_mem_list", entity);
	}
	
	public User Srch_Mem(User entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.user.srch_mem", entity);
	}
	
	public Integer Fix_Mem(User entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.user.fix_mem", entity);
	}
	
	public Integer Del_Mem(User entity) throws Exception{
		return sqlSession.delete("com.ipduckhelper.user.del_mem", entity);
	}
	
	public Integer Acvt_Mem(User entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.user.acvt_mem", entity);
	}
	
	public User Login_Mem(User entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.user.login_mem", entity);
	}
	
	public User File_Info(String mem_id) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.user.file_info", mem_id);
	}
}
