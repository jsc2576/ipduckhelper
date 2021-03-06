package com.ipduckhelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class SessionInterCeptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		try {
			if(request.getSession().getAttribute("SessionSuccess") == null || 
					request.getSession().getAttribute("mem_id") == null) {
				response.sendRedirect("/login/view");
				return false;
			} 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return true;
	}
}
