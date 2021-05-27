package com.springboot.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



/* Replacement for @RunWith(MockitoJUnitRunner.class) of Junit4*/
@ExtendWith(MockitoExtension.class)

class MainBussinessImplMockitoAnnotationTest {

	@Mock
	MainDataService dataServiceMock;
	
	@InjectMocks
	MainBussinessImpl mainBussinessImpl;
	
	@Test
	void testFindGreatestFromAllDataWith123() {		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});				
		int result = mainBussinessImpl.findGreatestFromAllData();		
		System.out.println("The result of testFindGreatestFromAllData is "+result);		
		assertEquals(3,result);   /* Pass */
	}
	
	@Test
	void testFindGreatestFromAllDataWith12() {			
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2});				
		int result = mainBussinessImpl.findGreatestFromAllData();		
		System.out.println("The result of testFindGreatestFromAllData is "+result);		
		assertEquals(2,result);   /* Pass */
	}
	
	@Test
	void testFindGreatestFromAllDataWith1() {			
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1});				
		int result = mainBussinessImpl.findGreatestFromAllData();		
		System.out.println("The result of testFindGreatestFromAllData is "+result);		
		assertEquals(1,result);   /* Pass */
	}
	
	
}
