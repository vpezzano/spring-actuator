package com.javacodegeeks.war;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.javacodegeeks.SpringActuatorApplication;

public class InitDemoWarInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("SpringApplicationBuilder: configure invoked.");
		SpringActuatorApplication.addInitHooks(builder.application());
		return builder.sources(SpringActuatorApplication.class);
	}
}
