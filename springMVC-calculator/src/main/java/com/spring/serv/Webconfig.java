

package com.spring.serv;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Webconfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("one");
		Class arr[]= {LoveCalculatorAppconfig.class};
		
		return arr;
		
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("two");	
		
		//mywebsite.com/*
		
		String arr[] = { "/" };
		return arr;
	}

}

