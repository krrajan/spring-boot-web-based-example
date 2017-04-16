package com.spring.boot.controller;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@EnableWebMvc
public class WelcomeController extends WebMvcConfigurerAdapter  {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(Map<String, Object> model){
		 model.put("message", "Hello, Guys First spring boot web application using embeded tomcat!");
		 return "welcome";
	}
	
	/*@Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        return resolver;
    }*/

	
	
}
