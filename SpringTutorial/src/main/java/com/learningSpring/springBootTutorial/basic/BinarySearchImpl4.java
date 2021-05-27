package com.learningSpring.springBootTutorial.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
// @Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl4 {
	
	@Autowired
	@Qualifier("BubbleSort")
	private SortAlgorithm bubbleSortAlgorithm;
	
	@Autowired
	@Qualifier("QuickSort")
	private SortAlgorithm quickSortAlgorithm;
	
	
	public SortAlgorithm getBubbleSortAlgorithm() {
		return bubbleSortAlgorithm;
	}

	public void setBubbleSortAlgorithm(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}

	public SortAlgorithm getQuickSortAlgorithm() {
		return quickSortAlgorithm;
	}

	public void setQuickSortAlgorithm(SortAlgorithm quickSortAlgorithm) {
		this.quickSortAlgorithm = quickSortAlgorithm;
	}

	public String binarySearch(int[] numbers, int numberToSearchFor) {		
		
	// Search the array
		String resultByBubble = bubbleSortAlgorithm.sort(numbers);
		String resultByQuick = quickSortAlgorithm.sort(numbers);
		
		
				
		// Return the result
		return resultByBubble + "--" + resultByQuick;
	}

}
