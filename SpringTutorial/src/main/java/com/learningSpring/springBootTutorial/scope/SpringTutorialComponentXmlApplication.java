package com.learningSpring.springBootTutorial.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learningSpring.springBootTutorial.basic.BinarySearchImpl3;
import com.learningSpring.springBootTutorial.basic.BinarySearchImpl4;
import com.learningSpring.springBootTutorial.xml.ComponentXmlDAO;



public class SpringTutorialComponentXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialComponentXmlApplication.class);

	public static void main(String[] args) {

		LOGGER.info("************************ SpringTutorialComponentXmlApplication Started *********************");

		ClassPathXmlApplicationContext applicationXmlContext = new ClassPathXmlApplicationContext(
				"appilcationContext.xml");
		
		LOGGER.info("Beans Loaded are --> {}", (Object)applicationXmlContext.getBeanDefinitionNames());

		ComponentXmlDAO componentXmlDAO = applicationXmlContext.getBean(ComponentXmlDAO.class);

		
		LOGGER.info("************************ componentXmlDAO Started *********************");
		LOGGER.info("componentXmlDAO is " + componentXmlDAO);
		LOGGER.info("componentXmlDAO.getXmlJdbcConnection() is " + componentXmlDAO.getComponentXmlJdbcConnection());
		LOGGER.info("************************ componentXmlDAO Ended *********************");
		
		
		BinarySearchImpl3 binarySearchImpl3 = applicationXmlContext.getBean(BinarySearchImpl3.class);
		
		LOGGER.info("************************ binarySearchImpl3 Started *********************");
		LOGGER.info("binarySearchImpl3 is " + binarySearchImpl3);
		LOGGER.info("binarySearchImpl3.binarySearch() is " + binarySearchImpl3.binarySearch(new int[] {1,2,3}, 2));
		LOGGER.info("************************ binarySearchImpl3 Ended *********************");
		
		
		BinarySearchImpl4 binarySearchImpl4 = applicationXmlContext.getBean(BinarySearchImpl4.class);
		
		LOGGER.info("************************ binarySearchImpl4 Started *********************");
		LOGGER.info("binarySearchImpl4 is " + binarySearchImpl4);
		LOGGER.info("binarySearchImpl4.binarySearch() is " + binarySearchImpl4.binarySearch(new int[] {1,2,3}, 2));
		LOGGER.info("************************ binarySearchImpl4 Ended *********************");
		
		applicationXmlContext.close();
		
		LOGGER.info("********************* SpringTutorialComponentXmlApplication Ended *************************");
	}

}
