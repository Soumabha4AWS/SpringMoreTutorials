package com.learningSpring.springBootTutorial.basic;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;

import com.learningSpring.springBootTutorial.propertyFile.ExternalService;

@Configuration
@ComponentScan("com.learningSpring.springBootTutorial.propertyFile")
@PropertySource("classpath:myPropertyFile.properties")


public class SpringTutorialPropertyFileApplication {
	
	

	public static void main(String[] args) {
		System.out.println("************************ SpringTutorialPropertyFileApplication Started *********************");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTutorialPropertyFileApplication.class);
		
		
		ExternalService externalService = applicationContext.getBean(ExternalService.class);
		
		System.out.println("externalService is "+externalService.returnServiceURL());
		
		((AbstractApplicationContext) applicationContext).close();
		
		System.out.println("********************* SpringTutorialPropertyFileApplication Ended *************************");
	}

}
