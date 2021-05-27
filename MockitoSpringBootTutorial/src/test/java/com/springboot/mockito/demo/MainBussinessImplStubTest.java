package com.springboot.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainBussinessImplStubTest {

	@Test
	void testFindGreatestFromAllDataWith123() {
		MainBussinessImpl mainBussinessImpl = new MainBussinessImpl(new MainDataServiceStubWith123());
		int result = mainBussinessImpl.findGreatestFromAllData();
		System.out.println("The result of testFindGreatestFromAllData is "+result);
		assertEquals(3,result);   /* Pass */
	}
	
	
	@Test
	void testFindGreatestFromAllDataWith12() {
		MainBussinessImpl mainBussinessImpl = new MainBussinessImpl(new MainDataServiceStubWith12());
		int result = mainBussinessImpl.findGreatestFromAllData();
		System.out.println("The result of testFindGreatestFromAllData is "+result);
		assertEquals(2,result);   /* Pass */
	}
	
	
	@Test
	void testFindGreatestFromAllDataWith1() {
		MainBussinessImpl mainBussinessImpl = new MainBussinessImpl(new MainDataServiceStubWith1());
		int result = mainBussinessImpl.findGreatestFromAllData();
		System.out.println("The result of testFindGreatestFromAllData is "+result);
		assertEquals(1,result);   /* Pass */
	}
	
}
