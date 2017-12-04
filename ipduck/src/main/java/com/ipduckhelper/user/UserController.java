package com.ipduckhelper.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public User main(@ModelAttribute User entity) {
		return userService.mainSer(entity);
	}
}
