package com.baz.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class beanConfig {
	
	@Bean
	@SessionScope
	public sesionGenerator sessionScope() {
		return new sesionGenerator();
	}

}
