package com.javacodegeeks.laziness.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyResourceDependency {
	public LazyResourceDependency() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}
}
