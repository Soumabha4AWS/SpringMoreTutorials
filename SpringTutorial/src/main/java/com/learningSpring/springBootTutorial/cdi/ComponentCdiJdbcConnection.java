package com.learningSpring.springBootTutorial.cdi;

import javax.inject.Named;


@Named
public class ComponentCdiJdbcConnection {
	
	public void getComponentCdiJdbcConnection() {
		System.out.println("ComponentCdiJdbcConnection Established");
	}

}
