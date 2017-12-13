package com.ipduckhelper.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ipduckhelper.star.Star;

@Controller
public class test {

	@RequestMapping("/test")
	public String Main() {
		return "index";
	}

	/**
	 * 
	 * 
	 * 
	 */
	@RequestMapping(value = "/test/file", method=RequestMethod.POST)
	@ResponseBody
	public Integer Crt_Star(HttpServletRequest request, @ModelAttribute Star s) throws Exception{//@RequestParam("file") MultipartFile file,@RequestParam("test") String test ) throws Exception{
		System.out.println(s);
		return 0;
	}
	
}
