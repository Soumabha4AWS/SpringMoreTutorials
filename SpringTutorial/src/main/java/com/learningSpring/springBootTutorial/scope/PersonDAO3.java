package com.learningSpring.springBootTutorial.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class PersonDAO3 {
	
	@Autowired
	JdbcConnection3 jdbcConnection;

	public JdbcConnection3 getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection3 jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	
	
}
