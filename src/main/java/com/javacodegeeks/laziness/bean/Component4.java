package com.javacodegeeks.laziness.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class Component4 {
	public Component4() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}
}
