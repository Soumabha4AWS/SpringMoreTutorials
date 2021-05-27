package com.learningSpring.springBootTutorial.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class PersonDAO4 {
	
	@Autowired
	JdbcConnection4 jdbcConnection;

	public JdbcConnection4 getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection4 jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	
	
}
