package com.javacodegeeks.laziness.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(lazyInit = true, basePackages = { "com.javacodegeeks.laziness.bean" })
public class LazyConfig {
}
