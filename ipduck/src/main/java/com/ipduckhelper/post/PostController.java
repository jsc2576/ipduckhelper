package com.ipduckhelper.post;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

	@Autowired
	PostService postService;
	
	/**
	 * 게시글 추가
	 * need value : mem_id, star_idx, post_ttl, post_con, upload_img, list(tag_nm)
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/crt/post/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Post(HttpServletRequest request, @ModelAttribute Post entity) throws Exception{
		return postService.Crt_Post(entity);
	}
	
	/**
	 * 제목으로 게시글 리스트 검색
	 * need value : post_ttl, offset
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/post/ttl/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Post> Srch_Post_Ttl_List(@ModelAttribute Post entity) throws Exception{
		return postService.Srch_Post_Ttl_List(entity);
	}
	
	/**
	 * 태그로 게시글 리스트 검색
	 * need value : tag_nm, offset
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/post/tag/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Post> Srch_Post_Tag_List(@ModelAttribute Post entity) throws Exception{
		return postService.Srch_Post_Tag_List(entity);
	}
	
	/**
	 * 게시글 상세 검색
	 * need value : post_idx
	 * @param post_idx
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/post/do", method=RequestMethod.POST)
	@ResponseBody
	public Post Srch_Post(@RequestParam("post_idx") Integer post_idx) throws Exception{
		return postService.Srch_Post(post_idx);
	}
	
	/**
	 * 게시글 수정
	 * need value : post_idx, post_ttl, post_con, mem_id, upload_img(null)
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fix/post/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Post(@ModelAttribute Post entity) throws Exception{
		return postService.Fix_Post(entity);
	}
	
	/**
	 * 게시글 삭제
	 * need value : post_idx, mem_id
	 * @param post_idx
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/post/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Post(@RequestParam("post_idx") Integer post_idx) throws Exception{
		return postService.Del_Post(post_idx);
	}
	
	/**
	 * 게시글 추천
	 * need value : post_idx, mem_id
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/like/post/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Like_Post(@ModelAttribute Post entity) throws Exception{
		return postService.Like_Post(entity);
	}
}
