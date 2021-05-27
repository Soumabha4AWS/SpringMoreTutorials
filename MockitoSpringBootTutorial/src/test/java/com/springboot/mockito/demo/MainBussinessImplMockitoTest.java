package com.springboot.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class MainBussinessImplMockitoTest {

	@Test
	void testFindGreatestFromAllDataWith123() {		
		MainDataService dataServiceMock = mock(MainDataService.class);		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});		
		MainBussinessImpl mainBussinessImpl = new MainBussinessImpl(dataServiceMock);		
		int result = mainBussinessImpl.findGreatestFromAllData();		
		System.out.println("The result of testFindGreatestFromAllData is "+result);		
		// assertEquals(1,result);   /* Fail */
		assertEquals(3,result);   /* Pass */
	}
	
	@Test
	void testFindGreatestFromAllDataWith12() {		
		MainDataService dataServiceMock = mock(MainDataService.class);		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2});		
		MainBussinessImpl mainBussinessImpl = new MainBussinessImpl(dataServiceMock);		
		int result = mainBussinessImpl.findGreatestFromAllData();		
		System.out.println("The result of testFindGreatestFromAllData is "+result);		
		// assertEquals(1,result);   /* Fail */
		assertEquals(2,result);   /* Pass */
	}
	
	@Test
	void testFindGreatestFromAllDataWith1() {		
		MainDataService dataServiceMock = mock(MainDataService.class);		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1});		
		MainBussinessImpl mainBussinessImpl = new MainBussinessImpl(dataServiceMock);		
		int result = mainBussinessImpl.findGreatestFromAllData();		
		System.out.println("The result of testFindGreatestFromAllData is "+result);		
		// assertEquals(1,result);   /* Fail */
		assertEquals(1,result);   /* Pass */
	}
	
	
}
