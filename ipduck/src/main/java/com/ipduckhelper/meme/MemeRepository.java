package com.ipduckhelper.meme;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MemeRepository {

	@Autowired
	SqlSession sqlSession;
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class})
	public Integer Crt_Mm(Meme entity) throws Exception{
		sqlSession.insert("com.ipduckhelper.meme.crt_mm_first", entity);
		return sqlSession.insert("com.ipduckhelper.meme.crt_mm_second", entity);
	}
	
	public List<Meme> Srch_Mm_List(Meme entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.meme.srch_mm_list", entity);
	}
	
	public Meme Srch_Mm(Meme entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.meme.srch_mm", entity);
	}
	
	public Integer Fix_Mm(Meme entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.meme.fix_mm", entity);
	}
	
	public Integer Del_Mm(Meme entity) throws Exception{
		return sqlSession.delete("com.ipduckhelper.meme.del_mm", entity);
	}
	
	public Integer Add_Tag_Mm(Meme entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.meme.add_tag_mm", entity);
	}
}
