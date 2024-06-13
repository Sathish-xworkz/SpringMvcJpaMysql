package com.sathish.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// web config file need to load..
		return new Class[] {WebMvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//JPA root configuration file need to load 
		return new Class[] {PersistenceJPAConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// URl Mapping..
		return new String[] {"/"};
	}

}
