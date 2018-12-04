package com.javacodegeeks.laziness.bean;

import org.springframework.stereotype.Component;

@Component
public class ResourceDependency {
	public ResourceDependency() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}
}
