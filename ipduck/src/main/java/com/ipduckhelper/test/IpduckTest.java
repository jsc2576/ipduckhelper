package com.ipduckhelper.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IpduckTest {

	@RequestMapping("/")
	public String ReturnMain() {
		return "test";
	}
}
