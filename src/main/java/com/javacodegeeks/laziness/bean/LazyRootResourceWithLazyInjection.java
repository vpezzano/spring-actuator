package com.javacodegeeks.laziness.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Marking a bean with @Lazy doesn’t mean its dependencies are also lazy initialized.
 * In this case ResourceDependency will be created on startup, but not LazyRootResource.
 */
@Component
@Lazy
public class LazyRootResourceWithLazyInjection {
	private ResourceDependency resourceDependency;

	/*
	 * The @Lazy annotation can also be used for injection points like constructors,
	 * constructor’s parameters, fields and setters.
	 */
	@Lazy
	public LazyRootResourceWithLazyInjection(ResourceDependency resourceDependency) {
		this.resourceDependency = resourceDependency;
	}
	
	public void useDependency() {
		System.out.println("Using " + this.resourceDependency + ".");
	}
}
