package com.ipduckhelper;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfig {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				// TODO Auto-generated method stub
				ErrorPage errorPage404 = new ErrorPage(HttpStatus.FORBIDDEN, "/");
				ErrorPage errorPage403 = new ErrorPage(HttpStatus.NOT_FOUND, "/");
				ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/");
				
				
				container.addErrorPages(errorPage403, errorPage404, errorPage500);
			}
		};
	}
}
