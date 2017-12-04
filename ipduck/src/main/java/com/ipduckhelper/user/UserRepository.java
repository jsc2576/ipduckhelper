package com.ipduckhelper.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public User mainRep(User entity) {
		return sqlSession.selectOne("com.ipduckhelper.user.srch_mem_list", entity);
	}
}
