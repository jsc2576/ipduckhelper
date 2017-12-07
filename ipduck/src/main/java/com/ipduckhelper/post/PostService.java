package com.ipduckhelper.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipduckhelper.CommonUtil;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;
	
	public Integer Crt_Post(Post entity) throws Exception{
		
		if(!entity.getUpload_img().isEmpty()) {
			entity.setFile_nm(CommonUtil.Upload_Image(entity.getUpload_img(), CommonUtil.getPostImgPath()));
			entity.setFile_path(CommonUtil.getPostImgPath());
		}
		
		return postRepository.Crt_Post(entity);
	}
	
	public List<Post> Srch_Post_Ttl_List(Post entity) throws Exception{
		return postRepository.Srch_Post_Ttl_List(entity);
	}
	
	public List<Post> Srch_Post_Tag_List(Post entity) throws Exception{
		return postRepository.Srch_Post_Tag_List(entity);
	}
	
	public Post Srch_Post(Integer post_idx) throws Exception{
		return postRepository.Srch_Post(post_idx);
	}
	
	public Integer Fix_Post(Post entity) throws Exception{
		int result = postRepository.Fix_Post(entity);
		
		if(!entity.getUpload_img().isEmpty()) {
			result = postRepository.Fix_File(entity);
		}
		return result;
	}
	
	public Integer Del_Post(Integer post_idx) throws Exception{
		return postRepository.Del_Post(post_idx);
	}
	
	public Integer Like_Post(Post entity) throws Exception{
		return postRepository.Like_Post(entity);
	}
}
