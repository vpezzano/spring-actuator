package com.javacodegeeks.laziness.bean;

import org.springframework.stereotype.Component;

@Component
public class Component3 {
	public Component3() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}
}
