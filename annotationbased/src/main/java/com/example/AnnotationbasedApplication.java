package com.example;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.controller.HomeController;

@SpringBootApplication
public class AnnotationbasedApplication {

	public static void main(String[] args) {
		ApplicationContext c= (ApplicationContext) SpringApplication.run(AnnotationbasedApplication.class, args);
		HomeController s=((BeanFactory) c).getBean(HomeController.class);
		System.out.println(s.access());
	}

}
