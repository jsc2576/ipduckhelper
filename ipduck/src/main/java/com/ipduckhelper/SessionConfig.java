package com.ipduckhelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SessionConfig extends WebMvcConfigurerAdapter{

	@Autowired
	SessionInterCeptor sessionInterCeptor;
	
	@Autowired
	AdministratorInterCeptor administratorInterCeptor;
	
	@Autowired
	MyInterCeptor myInterCeptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(sessionInterCeptor).addPathPatterns("/**/*.go", "/**/*.admin", "/**/*.my");
		registry.addInterceptor(administratorInterCeptor).addPathPatterns("/**/*.admin");
		registry.addInterceptor(myInterCeptor).addPathPatterns("/**/*.my");
	}
}
