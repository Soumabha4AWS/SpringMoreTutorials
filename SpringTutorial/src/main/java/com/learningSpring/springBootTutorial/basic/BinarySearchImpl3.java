package com.learningSpring.springBootTutorial.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.learningSpring.springBootTutorial.component.ComponentJdbcConnection;


@Component
// @Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl3 {
	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm3;
	
	@Autowired
	private SortAlgorithm quickSortAlgorithm3;
	
	
	public SortAlgorithm getBubbleSortAlgorithm3() {
		return bubbleSortAlgorithm3;
	}

	public void setBubbleSortAlgorithm3(SortAlgorithm bubbleSortAlgorithm3) {
		this.bubbleSortAlgorithm3 = bubbleSortAlgorithm3;
	}

	public SortAlgorithm getQuickSortAlgorithm3() {
		return quickSortAlgorithm3;
	}

	public void setQuickSortAlgorithm3(SortAlgorithm quickSortAlgorithm3) {
		this.quickSortAlgorithm3 = quickSortAlgorithm3;
	}




	public String binarySearch(int[] numbers, int numberToSearchFor) {		
		
	// Search the array
		String resultByBubble = bubbleSortAlgorithm3.sort(numbers);
		String resultByQuick = quickSortAlgorithm3.sort(numbers);
				
		// Return the result
		return resultByBubble + "--" + resultByQuick;
	}

}
