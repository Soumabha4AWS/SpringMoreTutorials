package com.learningSpring.springBootTutorial.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ComponentXmlDAO {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentXmlDAO.class);
	
	
	ComponentXmlJdbcConnection componentXmlJdbcConnection;	

	
	public ComponentXmlJdbcConnection getComponentXmlJdbcConnection() {
		return componentXmlJdbcConnection;
	}

	public void setComponentXmlJdbcConnection(ComponentXmlJdbcConnection componentXmlJdbcConnection) {
		this.componentXmlJdbcConnection = componentXmlJdbcConnection;
	}

	@PostConstruct	
	public void postConstruct() {
		LOGGER.info("postConstruct is created");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy is being called");
	}
	
}
