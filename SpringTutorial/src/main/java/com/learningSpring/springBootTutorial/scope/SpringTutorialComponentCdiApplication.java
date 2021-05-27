package com.learningSpring.springBootTutorial.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.learningSpring.springBootTutorial.cdi.ComponentCdiDAO;

@Configuration
@ComponentScan("com.learningSpring.springBootTutorial.cdi")

public class SpringTutorialComponentCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialComponentCdiApplication.class);

	public static void main(String[] args) {
		
		LOGGER.info("************************ SpringTutorialComponentCdiApplication Started *********************");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTutorialComponentCdiApplication.class);
		
		
		ComponentCdiDAO componentCdiDAO = applicationContext.getBean(ComponentCdiDAO.class);
		
		
		
		LOGGER.info("componentCdiDAO is "+componentCdiDAO);
		
		LOGGER.info("componentCdiDAO.getJdbcConnection() is "+componentCdiDAO.getComponentCdiJdbcConnection());
		
		((AbstractApplicationContext) applicationContext).close();
		
		
		LOGGER.info("********************* SpringTutorialComponentCdiApplication Ended *************************");
	}

}
