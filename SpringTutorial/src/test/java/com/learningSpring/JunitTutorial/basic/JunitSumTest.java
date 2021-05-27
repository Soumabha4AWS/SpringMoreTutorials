package com.learningSpring.JunitTutorial.basic;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class JunitSumTest {

	
	
	
	@Before
	public void before() {
		System.out.println("********* Run before every test ***********");
	}
	
	
	
	@After
	public void after() {
		System.out.println("********* Run after every test *************");
	}
	
	JunitSum junitSum = new JunitSum();

	@Test
	public void sumWith5Numbers() {
		int finalTotal = junitSum.sum(new int[] { 1, 2, 3, 4, 5  });
		System.out.println("The total is " + finalTotal);
		assertEquals(15, finalTotal);
		}

	

	@Test
	public void sumWith3Numbers() {
		int finalTotal = junitSum.sum(new int[] { 7, 8, 9 });
		System.out.println("The total is " + finalTotal);
		assertEquals(24, finalTotal);
		}
	

}
