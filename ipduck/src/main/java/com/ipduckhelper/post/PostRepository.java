package com.ipduckhelper.post;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PostRepository {
	
	@Autowired
	SqlSession sqlSession;
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class}, isolation=Isolation.REPEATABLE_READ)
	public Integer Crt_Post(Post entity) throws Exception{
		int result = 0;
		
		entity.setPost_idx(sqlSession.insert("com.ipduckhelper.post.crt_post_first", entity));
		result = sqlSession.insert("com.ipduckhelper.post.crt_post_second", entity);
		
		if(!entity.getUpload_img().isEmpty()) {
			sqlSession.insert("com.ipduckhelper.post.crt_file_first", entity);
			result = sqlSession.insert("com.ipduckhelper.post.crt_file_second", entity);			
		}
		
		return result;
	}
	
	
	public List<Post> Srch_Post_Ttl_List(Post entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.post.srch_post_ttl_list", entity);
	}
	
	public List<Post> Srch_Post_Tag_List(Post entity) throws Exception{
		return sqlSession.selectList("com.ipduckhelper.post.srch_post_tag_list", entity);
	}
	
	@Transactional(readOnly=true, rollbackFor= {Exception.class})
	public Post Srch_Post(Integer post_idx) throws Exception{
		Post first = sqlSession.selectOne("com.ipduckhelper.post.srch_post_first", post_idx);
		Post second = sqlSession.selectOne("com.ipduckhelper.post.srch_post_second", post_idx);
		
		second.setPost_con(first.getPost_con());
		return second;
	}
	
	public Integer Fix_Post(Post entity) throws Exception{
		return sqlSession.update("com.ipduckhelper.post.fix_post", entity);
	}
	
	@Transactional(readOnly=false, rollbackFor= {Exception.class}, isolation=Isolation.REPEATABLE_READ)
	public Integer Fix_File(Post entity) throws Exception{
		sqlSession.delete("com.ipduckhelper.post.fix_file_first", entity);
		sqlSession.insert("com.ipduckhelper.post.fix_file_second", entity);
		return sqlSession.insert("com.ipduckhelper.post.fix_file_third", entity);
	}
	
	public Integer Del_Post(Integer post_idx) throws Exception{
		return sqlSession.delete("com.ipduckhelper.post.del_post", post_idx);
	}
	
	public Integer Like_Post(Post entity) throws Exception{
		return sqlSession.insert("com.ipduckhelper.post.like_post", entity);
	}
}
