package com.ipduckhelper.tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TagController {

	@Autowired
	private TagService tagService;
	
	@RequestMapping(value = "/crt/tag/do", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Tag(@RequestBody Tag entity) throws Exception{
		return tagService.Crt_Tag(entity);
	}
	
	@RequestMapping(value = "/srch/list/tag/do", method=RequestMethod.POST)
	@ResponseBody
	public List<Tag> Srch_Tag_List(@RequestBody Tag entity) throws Exception{
		return tagService.Srch_Tag_List(entity);
	}
}
