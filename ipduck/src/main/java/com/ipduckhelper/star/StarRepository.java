package com.ipduckhelper.star;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StarRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class})
	public Integer Crt_Star(Star entity) throws Exception{
		sqlSession.insert("com.ipduckhelper.star.crt_star_first", entity);
		sqlSession.insert("com.ipduckhelper.star.crt_star_second", entity);
		return sqlSession.insert("com.ipduckhelper.star.crt_star_third", entity);
	}
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class})
	public Integer Crt_Grp(Star entity) throws Exception{
		sqlSession.insert("com.ipduckhelper.star.crt_grp_first", entity);
		sqlSession.insert("com.ipduckhelper.star.crt_grp_second", entity);
		return sqlSession.insert("com.ipduckhelper.star.crt_grp_third", entity);
	}
	
	public List<Star> Srch_Star_List(Star entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.star.srch_star_list", entity);
	}
	
	public Star Srch_Star(Star entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.star.srch_star", entity);
	}
	
	public Star Srch_Grp(Star entity) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.star.srch_grp", entity);	
	}
	
	public Integer Fix_Star(Star entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.star.fix_star", entity);
	}
	
	public Integer Fix_Grp(Star entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.star.fix_grp", entity);
	}
	
	@Transactional(readOnly=false, rollbackFor = {Exception.class})
	public Integer Del_Star(Integer star_mem_idx) throws Exception{
		sqlSession.delete("com.ipduckhelper.star.del_star_profile", star_mem_idx);
		return sqlSession.delete("com.ipduckhelper.star.del_star", star_mem_idx);
	}
	
	@Transactional(readOnly=false, rollbackFor = {Exception.class})
	public Integer Del_Grp(Integer grp_idx) throws Exception{
		sqlSession.delete("com.ipduckhelper.star.del_grp_profile", grp_idx);
		return sqlSession.delete("com.ipduckhelper.star.del_grp", grp_idx);
	}
	
	public Integer Like_Star(Star entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.star.like_star", entity);
	}
	
	public Integer Add_Tag_Star(Star entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.star.add_tag_star", entity);
	}
	
	public Star Star_File_Info(Integer star_mem_idx) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.star.star_file_info", star_mem_idx);
	}
	
	public Star Grp_File_Info(Integer grp_idx) throws Exception{
		return sqlSession.selectOne("com.ipduckhelper.star.grp_file_info", grp_idx);
	}
}
