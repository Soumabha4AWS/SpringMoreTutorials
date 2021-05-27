package com.learningSpring.springBootTutorial.basic;

public class BinarySearchImpl1 {

	public String binarySearch(int[] numbers, int numberToSearchFor) {

		// Sorting an array  ---> Hard Coupled 
		BubbleSortAlgorithm1 bubbleSortAlgorithm = new BubbleSortAlgorithm1();
		QuickSortAlgorithm1 quickSortAlgorithm = new QuickSortAlgorithm1();
		
		// Search the array
		String resultByBubble = bubbleSortAlgorithm.sort(numbers);
		String resultByQuick = quickSortAlgorithm.sort(numbers);

		// Return the result
		return resultByBubble + "--" + resultByQuick;
	}

}
