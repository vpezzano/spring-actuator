package com.javacodegeeks.laziness.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Marking a bean with @Lazy doesn’t mean its dependencies are also lazy initialized.
 * In this case ResourceDependency will be created on startup, but not LazyRootResource.
 */
@Component
public class RootResourceWithLazyInjection {
	private LazyResourceDependency resourceDependency;

	/*
	 * The @Lazy annotation can also be used for injection points like constructors,
	 * constructor’s parameters, fields and setters.
	 */
	@Lazy
	public RootResourceWithLazyInjection(LazyResourceDependency resourceDependency) {
		System.out.println("Constructor of " + this + " invoked.");
		this.resourceDependency = resourceDependency;
	}

	/*
	 * If we comment out the @Bean annotation, no instance of LazyResourceDependency
	 * will be created, because it's marked @Lazy.
	 */
	@Bean
	public void useDependency() {
		System.out.println("Using " + this.resourceDependency + ".");
	}
}
