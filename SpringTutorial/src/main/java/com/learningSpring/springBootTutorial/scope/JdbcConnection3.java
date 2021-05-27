package com.learningSpring.springBootTutorial.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class JdbcConnection3 {
	
	public JdbcConnection3() {
		System.out.println("JdbcConnection3 Established");
	}

}
