package com.ipduckhelper.meme;

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
public class MemeController {

	@Autowired
	MemeService memeService;
	
	
	/**
	 * 밈 추가
	 * need value : upload_img, mem_id, list(star_idx)
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/crt/mm/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Mm(HttpServletRequest request, @ModelAttribute Meme entity) throws Exception{
		return memeService.Crt_Mm(entity);
	}
	
	/**
	 * 연예인으로 밈 검색
	 * need value : star_nm, offset
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/mm/star/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Meme> Srch_Mm_Star_List(@ModelAttribute Meme entity) throws Exception{
		return memeService.Srch_Mm_Star_List(entity);
	}
	
	/**
	 * 태그로 밈 검색
	 * need value : tag_nm, offset
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/mm/tag/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Meme> Srch_Mm_Tag_List(@ModelAttribute Meme entity) throws Exception{
		return memeService.Srch_Mm_Tag_List(entity);
	}
	
	/**
	 * 밈 수정
	 * need value : upload_img, mm_idx
	 * need header : mem_id
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fix/mm/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Mm(HttpServletRequest request, @ModelAttribute Meme entity) throws Exception{
		return memeService.Fix_Mm(entity);
	}
	
	/**
	 * 밈 삭제
	 * need value : mm_idx
	 * need header : mem_id
	 * @param request
	 * @param mm_idx
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/mm/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Mm(HttpServletRequest request, @RequestParam("mm_idx") Integer mm_idx) throws Exception{
		return memeService.Del_Mm(mm_idx);
	}
	
	/**
	 * 밈에 태그 추가
	 * need value : tag_nm, mm_idx
	 * need header : mem_id
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/add/tag/mm/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Add_Tag_Mm(HttpServletRequest request, @ModelAttribute Meme entity) throws Exception{
		return memeService.Add_Tag_Mm(entity);
	}
	
	/**
	 * 밈 태그 삭제
	 * need value : tag_nm, mm_idx
	 * need header : mem_id
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/tag/mm/do.my", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Tag_Mm(HttpServletRequest request, @ModelAttribute Meme entity) throws Exception{
		return memeService.Del_Tag_Mm(entity);
	}
}
