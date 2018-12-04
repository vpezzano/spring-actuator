package com.javacodegeeks.laziness.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component1 {
	@Autowired
	private Component2 component2;

	public Component1() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}

	public void use() {
		System.out.println("Using " + this.component2);
	}
}
