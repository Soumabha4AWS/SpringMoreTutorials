package com.learningSpring.springBootTutorial.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
	   proxyMode = ScopedProxyMode.TARGET_CLASS)

public class JdbcConnection4 {
	
	public JdbcConnection4() {
		// System.out.println("JdbcConnection4 Established");
	}

}
