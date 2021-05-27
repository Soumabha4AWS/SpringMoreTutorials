package com.learningSpring.springBootTutorial.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.learningSpring.springBootTutorial.component.ComponentDAO;

@Configuration
@ComponentScan("com.learningSpring.springBootTutorial.component")

public class SpringTutorialComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialComponentApplication.class);

	public static void main(String[] args) {
		
		LOGGER.info("************************ SpringTutorialComponentApplication Started *********************");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTutorialComponentApplication.class);
		
		
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		
		
		LOGGER.info("componentDAO is "+componentDAO);
		
		LOGGER.info("componentDAO.getJdbcConnection() is "+componentDAO.getJdbcConnection());
		
				
		((AbstractApplicationContext) applicationContext).close();
		
		LOGGER.info("********************* SpringTutorialComponentApplication Ended *************************");
	}

}
