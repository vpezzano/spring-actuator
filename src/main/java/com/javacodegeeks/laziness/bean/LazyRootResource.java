package com.javacodegeeks.laziness.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Marking a bean with @Lazy doesn’t mean its dependencies are also lazy initialized.
 * In this case ResourceDependency will be created on startup, but not LazyRootResource.
 */
@Component
@Lazy
public class LazyRootResource {
	private ResourceDependency resourceDependency;

	public LazyRootResource(ResourceDependency resourceDependency) {
		System.out.println("Constructor of " + this + " invoked.");
		this.resourceDependency = resourceDependency;
	}
	
	public void useDependency() {
		System.out.println("Using " + this.resourceDependency + ".");
	}
}
