package com.javacodegeeks.laziness.bean;

public class MyResource {
	public MyResource() {
		System.out.println(this.getClass().getSimpleName() + " " + this + " created.");
	}
}
