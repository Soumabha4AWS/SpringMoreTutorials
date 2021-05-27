package com.learningSpring.springBootTutorial.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO1 {
	
	@Autowired
	JdbcConnection2 jdbcConnection;

	public JdbcConnection2 getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection2 jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	
	
}
