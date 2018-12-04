package com.javacodegeeks.laziness.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component2 {
	@Autowired
	private Component1 component1;

	public Component2() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}

	public void use() {
		System.out.println("Using " + this.component1);
	}
}
