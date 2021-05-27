package com.learningSpring.springBootTutorial.basic;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


/* Load the context */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/appilcationContext.xml")
public class BinarySearchImpl3Test {

	/* Get the bean from the context */
	@Autowired
	BinarySearchImpl3 binarySearchImpl3;
	
	
	@Before
	public void before() {
		System.out.println("******************** Run before every test ******************");
	}
	
		
	
	@Test
	public void testBasicScenario() {
		
		/* Call the method on binarySearch */
		String result = binarySearchImpl3.binarySearch(new int[] {1,2,3} , 2);
		
		/* Check if the value is correct */
		assertEquals("BubbleSortAlgorithm3--QuickSortAlgorithm3",result);
		
		System.out.println("***************** The result is "+result + " ***************");
	}
	
	
	@After
	public void after() {
		System.out.println("******************** Run after every test ***********************");
	}

}
