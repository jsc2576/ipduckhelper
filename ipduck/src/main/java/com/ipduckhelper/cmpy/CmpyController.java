package com.ipduckhelper.cmpy;

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
public class CmpyController {
	@Autowired
	CmpyService cmpyService;
	
	@RequestMapping(value = "/crt/cmpy/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Cmpy(HttpServletRequest request, @RequestBody Cmpy entity) throws Exception{
		return cmpyService.Crt_Cmpy(entity);
	}

	@RequestMapping(value = "/srch/names/cmpy/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Cmpy> Srch_Cmpy_Names(@RequestBody Cmpy entity) throws Exception{
		return cmpyService.Srch_Cmpy_Names(entity);
	}

	@RequestMapping(value = "/srch/list/cmpy/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Cmpy> Srch_Cmpy_List(@RequestBody Cmpy entity) throws Exception{
		return cmpyService.Srch_Cmpy_List(entity);
	}
	
	@RequestMapping(value = "/srch/cmpy/do", method=RequestMethod.POST)
	@ResponseBody
	public Cmpy Srch_Cmpy(@RequestBody Cmpy entity) throws Exception{
		return cmpyService.Srch_Cmpy(entity);
	}
	
	@RequestMapping(value = "/fix/cmpy/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Fix_Cmpy(HttpServletRequest request, @RequestBody Cmpy entity) throws Exception{
		return cmpyService.Fix_Cmpy(entity);
	}
	
	@RequestMapping(value = "/del/cmpy/do.admin", method=RequestMethod.POST)
	@ResponseBody
	public Integer Del_Cmpy(HttpServletRequest request, @RequestParam("cmpy_nm") String cmpy_nm) throws Exception{
		return cmpyService.Del_Cmpy(cmpy_nm);
	}
}
