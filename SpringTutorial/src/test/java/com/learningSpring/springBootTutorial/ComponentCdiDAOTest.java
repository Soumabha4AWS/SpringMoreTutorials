package com.learningSpring.springBootTutorial;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.learningSpring.springBootTutorial.cdi.ComponentCdiDAO;
import com.learningSpring.springBootTutorial.scope.SpringTutorialComponentCdiApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringTutorialComponentCdiApplication.class)
class ComponentCdiDAOTest {

	@Autowired
	ComponentCdiDAO componentCdiDAO;

	@Test
	void test() {
		String finalResult = componentCdiDAO.getClassName();
		assertEquals("ComponentCdiJdbcConnection", finalResult);
	}

}
