package com.learningSpring.springBootTutorial.basic;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;



@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes=SpringTutorialBasicApplication.class)

public class BinarySearchImplTest {

	@InjectMocks
	BinarySearchImpl3 binarySearchImpl3;
	
	@InjectMocks
	BinarySearchImpl4 binarySearchImpl4;
	
	@Mock
	private BubbleSortAlgorithm4 bubbleSortAlgorithmMock;
	
	@Mock
	private QuickSortAlgorithm4 quickSortAlgorithmMock;
	
	@Before
	public void before() {
		System.out.println("******************** Run before every test ******************");
	}
	
		
	
	@Test
	public void testBasicScenario() {	
				
			
		when(bubbleSortAlgorithmMock.sort(new int[] {1,2,3})).thenReturn("bubbleSortAlgorithm");
		when(quickSortAlgorithmMock.sort(new int[] {1,2,3})).thenReturn("quickSortAlgorithm");
		
		String result3 = binarySearchImpl4.binarySearch(new int[] {1,2,3}, 2);
				
		System.out.println("The result of binarySearchImpl4 is "+result3);		
		assertEquals(3,result3);   /* Pass */
		
		System.out.println("***************** The result is "+result3 + " ***************");
	}
	
	
	@After
	public void after() {
		System.out.println("******************** Run after every test ***********************");
	}

}
