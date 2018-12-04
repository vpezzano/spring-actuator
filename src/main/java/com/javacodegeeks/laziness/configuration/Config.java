package com.javacodegeeks.laziness.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.javacodegeeks.laziness.bean.MyResource;

/*
 * @Lazy can also be used directly on a @Configuration class. In that case, all @Bean 
 * objects defined in the class are lazily initialized.
 */
@Configuration
public class Config {
	@Bean
	@Lazy
	public MyResource create() {
		return new MyResource();
	}
}
