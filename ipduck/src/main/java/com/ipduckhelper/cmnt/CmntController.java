package com.ipduckhelper.cmnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CmntController {

	@Autowired
	CmntService cmntService;
	
	/**
	 * 댓글 작성
	 * need value : cmnt_con, post_idx, mem_id, high_cmnt_idx
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/crt/cmnt/do.go", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Cmnt(@RequestBody Cmnt entity) throws Exception{
		return cmntService.Crt_Cmnt(entity);
	}
	
	/**
	 * 댓글 리스트 검색
	 * need value : post_idx, offset
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/list/cmnt/do", method = RequestMethod.POST)
	@ResponseBody
	public List<Cmnt> Srch_Cmnt_List(@RequestBody Cmnt entity) throws Exception{
		return cmntService.Srch_Cmnt_list(entity);
	}
	
	/**
	 * 댓글 수정
	 * need value : cmnt_con, cmnt_idx
	 * need header : mem_id
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/fix/cmnt/do.my", method = RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Cmnt(@RequestBody Cmnt entity) throws Exception{
		return cmntService.Fix_Cmnt(entity);
	}
	
	/**
	 * 댓글 삭제
	 * need value : cmnt_idx
	 * need header : mem_id
	 * @param cmnt_idx
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/del/cmnt/do.my", method = RequestMethod.POST)
	@ResponseBody
	public Integer Del_Cmnt(@RequestParam("cmnt_idx") Integer cmnt_idx) throws Exception{
		return cmntService.Del_Cmnt(cmnt_idx);
	}
}
