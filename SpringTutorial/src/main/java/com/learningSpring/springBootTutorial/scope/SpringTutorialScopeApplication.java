package com.learningSpring.springBootTutorial.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("com.learningSpring.springBootTutorial.scope")
public class SpringTutorialScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialScopeApplication.class);

	public static void main(String[] args) {
		
		LOGGER.info("************************ SpringTutorialScopeApplication Started *********************");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTutorialScopeApplication.class);
		
		
				
		PersonDAO1 personDAO1 = applicationContext.getBean(PersonDAO1.class);
		PersonDAO1 personDAO2 = applicationContext.getBean(PersonDAO1.class);

		PersonDAO2 personDAO3 = applicationContext.getBean(PersonDAO2.class);
		PersonDAO2 personDAO4 = applicationContext.getBean(PersonDAO2.class);
		
		PersonDAO3 personDAO5 = applicationContext.getBean(PersonDAO3.class);
		PersonDAO3 personDAO6 = applicationContext.getBean(PersonDAO3.class);
		
		PersonDAO4 personDAO7 = applicationContext.getBean(PersonDAO4.class);
		PersonDAO4 personDAO8 = applicationContext.getBean(PersonDAO4.class);
		
		
		LOGGER.info("********************************* All Scope being SingleTon **************************************");
		
		LOGGER.info("personDAO1 is "+personDAO1);
		LOGGER.info("personDAO2 is "+personDAO2);
		
		LOGGER.info("personDAO1.getJdbcConnection() is "+personDAO1.getJdbcConnection());
		LOGGER.info("personDAO2.getJdbcConnection() is "+personDAO2.getJdbcConnection());
				
		LOGGER.info("******************************** Parent Scope being Prototype ********************");

		LOGGER.info("personDAO3 is "+personDAO3);
		LOGGER.info("personDAO4 is "+personDAO4);
		
		LOGGER.info("personDAO3.getJdbcConnection() is "+personDAO3.getJdbcConnection());
		LOGGER.info("personDAO4.getJdbcConnection() is "+personDAO4.getJdbcConnection());	
		
		LOGGER.info("******************************** Child Scope being Prototype ********************");

		LOGGER.info("personDAO5 is "+personDAO5);
		LOGGER.info("personDAO6 is "+personDAO6);
		
		LOGGER.info("personDAO5.getJdbcConnection() is "+personDAO5.getJdbcConnection());
		LOGGER.info("personDAO6.getJdbcConnection() is "+personDAO6.getJdbcConnection());
		
		
		LOGGER.info("******************************** Child Scope being Prototype with Proxy ********************");

		LOGGER.info("personDAO7 is "+personDAO7);
		LOGGER.info("personDAO8 is "+personDAO8);
		
		LOGGER.info("personDAO7.getJdbcConnection() is "+personDAO7.getJdbcConnection());
		LOGGER.info("personDAO8.getJdbcConnection() is "+personDAO8.getJdbcConnection());
		
		((AbstractApplicationContext) applicationContext).close();
		
		LOGGER.info("********************* SpringTutorialScopeApplication Ended *************************");
	}

}
