package com.learningSpring.springBootTutorial.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learningSpring.springBootTutorial.xml.ComponentXmlDAO;



public class SpringTutorialComponentScanXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialComponentScanXmlApplication.class);

	public static void main(String[] args) {

		LOGGER.info("************************ SpringTutorialComponentXmlApplication Started *********************");

		ClassPathXmlApplicationContext applicationXmlContext = new ClassPathXmlApplicationContext(
				"appilcationContextComponentScan.xml");
		
		LOGGER.info("Beans Loaded are --> {}", (Object)applicationXmlContext.getBeanDefinitionNames());

		ComponentXmlDAO componentXmlDAO = applicationXmlContext.getBean(ComponentXmlDAO.class);

		LOGGER.info("componentXmlDAO is " + componentXmlDAO);

		LOGGER.info("componentXmlDAO.getXmlJdbcConnection() is " + componentXmlDAO.getComponentXmlJdbcConnection());

		applicationXmlContext.close();
		
		LOGGER.info("********************* SpringTutorialComponentXmlApplication Ended *************************");
	}

}
