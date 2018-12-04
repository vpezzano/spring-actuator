package com.javacodegeeks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.javacodegeeks.laziness.bean.Component3;
import com.javacodegeeks.laziness.bean.Component4;

@SpringBootApplication
@ComponentScan(excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { Component3.class, Component4.class }) })
public class SpringActuatorApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringActuatorApplication.class);

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringActuatorApplication.class);
		addInitHooks(application);
		application.run(args);
	}

	public static void addInitHooks(SpringApplication application) {
		ApplicationListener<ApplicationEnvironmentPreparedEvent> envPreparedListener = new ApplicationListener<ApplicationEnvironmentPreparedEvent>() {
			@Override
			public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
				log.info("ApplicationEnvironmentPrepared event.");
				String version = event.getEnvironment().getProperty("java.runtime.version");
				log.info("Running with Java {}.", version);
			}
		};
		
		ApplicationListener<ApplicationStartingEvent> appStartingListener = event -> {
			log.info("ApplicationStartingEvent event.");
			WebApplicationType webAppType = event.getSpringApplication().getWebApplicationType();
			log.info("WebApplicationType is {}", webAppType);
		};
		application.addListeners(envPreparedListener, appStartingListener);
	}
}
