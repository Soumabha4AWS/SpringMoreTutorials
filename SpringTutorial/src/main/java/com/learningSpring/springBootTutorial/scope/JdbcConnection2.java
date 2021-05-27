package com.learningSpring.springBootTutorial.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection2 {
	
	public JdbcConnection2() {
		System.out.println("JdbcConnection2 Established");
	}

}
