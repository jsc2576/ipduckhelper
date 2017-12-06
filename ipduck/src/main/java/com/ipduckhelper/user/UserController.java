package com.ipduckhelper.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 회원가입 페이지
	 * @return
	 */
	@RequestMapping("/signup/view")
	public String SignUp_View() {
		return "";
	}
	
	/**
	 * 로그인 페이지
	 * @return
	 */
	@RequestMapping("/login/view")
	public String Login_View() {
		return "index";
	}
	
	/**
	 * 회원 가입 
	 * need value : profile_img, mem_id, mem_pwd, mem_nick, mem_nm
	 * @param profile_img
	 * @param mem_id
	 * @param mem_pwd
	 * @param mem_nick
	 * @param mem_nm
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/signup/do", method=RequestMethod.POST)
	@ResponseBody
	public Integer SignUp(@ModelAttribute User entity) throws Exception{
		
		return userService.Crt_Mem(entity);
	}
	
	/**
	 * 로그인
	 * need value : mem_id, mem_pwd
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login/do", method=RequestMethod.POST)
	@ResponseBody
	public User Login(HttpServletRequest request, User entity) throws Exception{
		User userInfo = userService.Login_Mem(entity);
		
		if(userInfo != null && userInfo.getMem_id() != null & userInfo.getMem_id() != "") {
			request.getSession().setAttribute("SessionSuccess", true);
			request.getSession().setAttribute("mem_id", userInfo.getMem_id());
			request.getSession().setAttribute("mem_stat", userInfo.getMem_stat());
		}
		
		return userInfo;
	}
	
	
	/**
	 * 로그아웃
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout/do", method=RequestMethod.POST)
	@ResponseBody
	public Integer Logout(HttpServletRequest request) throws Exception{
		
		try {
			request.getSession().removeAttribute("mem_id");
			request.getSession().removeAttribute("SessionSuccess");
			request.getSession().removeAttribute("mem_stat");
			return 1;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * need value : offset
	 * @param request
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/srch/mem/do", method=RequestMethod.POST)
	@ResponseBody
	public List<User> Srch_Mem_List(HttpServletRequest request, User entity) throws Exception{
		return userService.Srch_Mem_List(entity);
	}
}
