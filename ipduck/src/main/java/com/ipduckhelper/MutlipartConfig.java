package com.ipduckhelper;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class MutlipartConfig {
	@Bean
	public MultipartConfigElement multipartConfigElement() {
	MultipartConfigFactory factory = new MultipartConfigFactory();
	factory.setMaxFileSize("512MB");
	factory.setMaxRequestSize("512MB");
	return factory.createMultipartConfig();
	}

	@Bean
	public MultipartResolver multipartResolver() {
	StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
	return multipartResolver;
	}
}
