package com.ipduckhelper.star;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StarController {

	@Autowired
	StarService starService;
	
	
	/**
	 * 연예인 생성
	 * need value : upload_img, star_nm, cmpy_nm, star_mem_hght, star_mem_bld, star_mem_wght, star_mem_birth, grp_idx
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/crt/star/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Star(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		return starService.Crt_Star_and_Grp(entity, true);
		// 참고 예시 : http://gangzzang.tistory.com/entry/스프링Spring-파일-업로드File-Upload
		
		// 바인딩이 안되는 경우 http://private.tistory.com/59 를 보고 수정
	}
	
	
	/**
	 * 그룹 생성
	 * need value : upload_img, star_nm, cmpy_nm, clb_site
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/crt/grp/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Grp(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		return starService.Crt_Star_and_Grp(entity, false);
	}
	
	
	/**
	 * 연예인과 그룹을 합쳐서 태그로 검색한다
	 * need value : offset, tag_nm
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/star/do.go", method=RequestMethod.POST)
	@ResponseBody
	public List<Star> Srch_Star_List(@RequestBody Star entity) throws Exception{
		return starService.Srch_Star_List(entity);
	}
	
	
	/**
	 * 연예인을 상세 조회한다
	 * need value : star_idx
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/star/do", method=RequestMethod.POST)
	@ResponseBody
	public Star Srch_Star(@RequestBody Star entity) throws Exception{
		return starService.Srch_Star(entity);
	}
	
	
	/**
	 * 그룹을 상세조회한다
	 * need value : star_idx
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/grp/do", method=RequestMethod.POST)
	@ResponseBody
	public Star Srch_Grp(@RequestBody Star entity) throws Exception{
		return starService.Srch_Grp(entity);
	}
	
	/**
	 * 연예인 수정
	 * need value : upload_img(null), file_path, file_nm, star_mem_hght, star_mem_bld, star_mem_wght, star_mem_birth, star_dbt_date, star_nm(그룹 이름), star_mem_idx 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fix/star/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Star(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		return starService.Fix_Star(entity);			
	}
	
	/**
	 * 그룹 수정
	 * need value : upload_img(null), file_path, file_nm, clb_site, dbt_date, grp_idx
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fix/grp/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Grp(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		return starService.Fix_Grp(entity);
	}
	
	/**
	 * 연예인 삭제 
	 * need value : star_mem_idx
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/star/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Star(HttpServletRequest request, @RequestParam("star_mem_idx") Integer star_mem_idx) throws Exception{
		return starService.Del_Star(star_mem_idx);
	}
	
	/**
	 * 그룹 삭제
	 * need value : grp_idx
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/grp/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Grp(HttpServletRequest request, @RequestParam("grp_idx") Integer grp_idx) throws Exception{
		return starService.Del_Grp(grp_idx);
	}
	
	
	/**
	 * 선호 연예인 등록
	 * need value : star_idx
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/like/star/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Like_Star(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		entity.setMem_id(String.valueOf(request.getSession().getAttribute("mem_id")));
		return starService.Like_Star(entity);
	}
	
	/**
	 * 연예인에 태그를 추가 등록한다
	 * need value : star_idx, tag_nm
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/tag/add/star/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Add_Tag_Star(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		return starService.Add_Tag_Star(entity);
	}
	
	
	/**
	 * 연예인 태그를 삭제한다.
	 * need value : star_idx, tag_nm
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/tag/del/star/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Tag_Star(HttpServletRequest request, @RequestBody Star entity) throws Exception{
		return starService.Del_Tag_Star(entity);
	}
}
