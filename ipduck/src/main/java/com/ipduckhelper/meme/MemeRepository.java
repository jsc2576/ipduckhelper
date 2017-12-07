package com.ipduckhelper.meme;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MemeRepository {

	@Autowired
	SqlSession sqlSession;
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class}, isolation=Isolation.REPEATABLE_READ)
	public Integer Crt_Mm(Meme entity) throws Exception{
		sqlSession.insert("com.ipduckhelper.meme.crt_mm_first", entity);
		return sqlSession.insert("com.ipduckhelper.meme.crt_mm_second", entity);
	}
	
	public List<Meme> Srch_Mm_Star_List(Meme entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.meme.srch_mm_star_list", entity);
	}
	
	public List<Meme> Srch_Mm_Tag_List(Meme entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.meme.srch_mm_tag_list", entity);
	}
	
	public Meme Srch_Mm(Meme entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.meme.srch_mm", entity);
	}
	
	public Integer Fix_Mm(Meme entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.meme.fix_mm", entity);
	}
	
	public Meme File_Info(Integer mm_idx) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.meme.file_info", mm_idx);
	}
	
	public Integer Del_Mm(Integer mm_idx) throws Exception{
		return sqlSession.delete("com.ipduckhelper.meme.del_mm", mm_idx);
	}
	
	public Integer Add_Tag_Mm(Meme entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.meme.add_tag_mm", entity);
	}
}
