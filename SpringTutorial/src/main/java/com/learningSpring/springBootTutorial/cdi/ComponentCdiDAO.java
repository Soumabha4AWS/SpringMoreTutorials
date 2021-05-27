package com.learningSpring.springBootTutorial.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Named
public class ComponentCdiDAO {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentCdiDAO.class);
	
	@Inject
	ComponentCdiJdbcConnection componentCdiJdbcConnection;

	
	public ComponentCdiJdbcConnection getComponentCdiJdbcConnection() {
		return componentCdiJdbcConnection;
	}

	public void setComponentCdiJdbcConnection(ComponentCdiJdbcConnection componentCdiJdbcConnection) {
		this.componentCdiJdbcConnection = componentCdiJdbcConnection;
	}

	
	public String getClassName() {
		return "ComponentCdiJdbcConnection";
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
