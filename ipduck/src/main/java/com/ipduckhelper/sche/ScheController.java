package com.ipduckhelper.sche;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ScheController {

	@Autowired
	ScheService scheService;
	
	/**
	 * 스케줄 작성
	 * need value : sche_nm, sche_date, sche_trm, star_idx, mem_id
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/crt/sche/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Sche(@ModelAttribute Sche entity) throws Exception{
		return scheService.Crt_Sche(entity);
	}
	
	/**
	 * 스케줄 검색
	 * need value : star_idx, sche_date(검색할 년, 달)
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/sche/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Sche> Srch_Sche_List(@ModelAttribute Sche entity) throws Exception{
		return scheService.Srch_Sche_List(entity);
	}
	
	/**
	 * 스케줄 수정
	 * need value : sche_nm, sche_date, sche_trm, sche_idx
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fix/sche/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Sche(@ModelAttribute Sche entity) throws Exception{
		return scheService.Fix_Sche(entity);
	}
	
	/**
	 * 스케줄 삭제
	 * need value : sche_idx
	 * @param sche_idx
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/sche/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Sche(@RequestParam("sche_idx") Integer sche_idx) throws Exception{
		return scheService.Del_Sche(sche_idx);
	}
}
