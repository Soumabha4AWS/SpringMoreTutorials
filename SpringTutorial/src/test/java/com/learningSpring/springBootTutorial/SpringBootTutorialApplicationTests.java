package com.learningSpring.springBootTutorial;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.learningSpring.springBootTutorial.basic.BinarySearchImpl3;
import com.learningSpring.springBootTutorial.basic.SpringTutorialBasicApplication;


@ContextConfiguration(classes=SpringTutorialBasicApplication.class)
public class SpringBootTutorialApplicationTests {

	
	@Autowired
	BinarySearchImpl3 binarySearchImpl3;
	
	@Test
	public void testBasicScenario() {
		String results = binarySearchImpl3.binarySearch(new int[] {} , 5);
		System.out.println("results is "+results);
	}

}
