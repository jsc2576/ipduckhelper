package com.ipduckhelper.tag;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TagRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public Integer Crt_Tag(Tag entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.tag.crt_tag", entity);
	}
	
	public List<Tag> Srch_Tag_List(Tag entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.tag.srch_tag_list", entity);
	}
}
