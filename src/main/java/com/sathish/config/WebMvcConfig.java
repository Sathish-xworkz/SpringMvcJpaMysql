package com.sathish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.sathish")
public class WebMvcConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/view/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		///SpringMVC/src/main/webapp
		registry.addResourceHandler("/URLToResources/**")
		.addResourceLocations("/WEB-INF/static/");
	}
}
