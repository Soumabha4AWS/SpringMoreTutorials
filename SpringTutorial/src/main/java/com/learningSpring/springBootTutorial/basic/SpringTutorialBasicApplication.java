package com.learningSpring.springBootTutorial.basic;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class SpringTutorialBasicApplication {
	
	

	public static void main(String[] args) {
		System.out.println("************************ SpringTutorialScopeApplication Started *********************");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTutorialBasicApplication.class);
		
		/*********** The tightly coupled ********************************/
		BinarySearchImpl1 binarySearchImpl1 = new BinarySearchImpl1(); 
		
		/*********** The loosely coupled ********************************/
		BinarySearchImpl2 binarySearchImpl2ByBubble = new BinarySearchImpl2(new BubbleSortAlgorithm2());
		BinarySearchImpl2 binarySearchImpl2ByQuick = new BinarySearchImpl2(new QuickSortAlgorithm2()); 
				
		/*********** The spring coupled ********************************/
		BinarySearchImpl3 binarySearchImpl3 = applicationContext.getBean(BinarySearchImpl3.class);
		BinarySearchImpl4 binarySearchImpl4 = applicationContext.getBean(BinarySearchImpl4.class);
		BinarySearchImpl3 binarySearchImpl3Another = applicationContext.getBean(BinarySearchImpl3.class);
		BinarySearchImpl4 binarySearchImpl4Another = applicationContext.getBean(BinarySearchImpl4.class);
		
		System.out.println("**********************************************************************************");
		
		System.out.println("binarySearchImpl3 is "+binarySearchImpl3);
		System.out.println("binarySearchImpl3Another is "+binarySearchImpl3Another);
		
		if (binarySearchImpl3 == binarySearchImpl3Another) {
			System.out.println("binarySearchImpl3 is same as binarySearchImpl3Another");
		}
		
		
		System.out.println("binarySearchImpl4 is "+binarySearchImpl4);
		System.out.println("binarySearchImpl4Another is "+binarySearchImpl4Another);
		
		if (binarySearchImpl4 != binarySearchImpl4Another) {
			System.out.println("binarySearchImpl4 is different than binarySearchImpl4Another");
		}
		
		
		int[] numbers = new int[] {1,2,3};
			
		String result1 = binarySearchImpl1.binarySearch(numbers, 5);
		String result2ByQuick = binarySearchImpl2ByQuick.binarySearch(numbers, 5);
		String result2ByBubble = binarySearchImpl2ByBubble.binarySearch(numbers, 5);
		String result2 = result2ByBubble + " -- " + result2ByQuick;
		String result3 = binarySearchImpl3.binarySearch(numbers, 5);
		String result4 = binarySearchImpl4.binarySearch(numbers, 5);
		
		System.out.println("**********************************************************************************");
		System.out.println("	The result of tight coupled is "+result1);
		System.out.println("");
		System.out.println("***********************************************************************************");
		
		System.out.println("	The result2 of losely coupled is "+result2);
		System.out.println("");
		System.out.println("***********************************************************************************");
		
		
		System.out.println("	The result3 of string coupled is "+result3);
		System.out.println("");
		System.out.println("***********************************************************************************");
		
		System.out.println("	The result4 of string coupled is "+result4);
		System.out.println("");
		System.out.println("***********************************************************************************");
		
		
		((AbstractApplicationContext) applicationContext).close();
		
		System.out.println("********************* SpringTutorialScopeApplication Ended *************************");
	}

}
