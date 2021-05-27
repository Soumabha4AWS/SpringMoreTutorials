package com.learningSpring.springBootTutorial.basic;

public class BinarySearchImpl2 {
	
	private SortAlgorithm sortAlgorithm;

	// Sorting an array  ---> Loosley Coupled 
	public BinarySearchImpl2(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public String binarySearch(int[] numbers, int numberToSearchFor) {		
		
		
	// Search the array
		String result = sortAlgorithm.sort(numbers);

		// Return the result
		return result;
	}

}
