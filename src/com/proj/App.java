package com.proj;

import javax.servlet.ServletConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletIntializer;


	
	public class App extends AbstractAnnotationConfigDispatcherServletInitializer{

		@Override
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] {ServletConfig.class};
		}

		@Override
		protected String[] getServletMappings() {
			return new String[]{"/"};
		}

	}

 
