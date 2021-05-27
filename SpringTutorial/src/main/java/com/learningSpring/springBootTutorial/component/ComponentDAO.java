package com.learningSpring.springBootTutorial.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponentDAO {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentDAO.class);
	
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.componentJdbcConnection = jdbcConnection;
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
