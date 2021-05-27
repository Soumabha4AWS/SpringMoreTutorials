package com.learningSpring.springBootTutorial.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection1 {
	
	public JdbcConnection1() {
		System.out.println("JdbcConnection2 Established");
	}

}
