package com.learningSpring.springBootTutorial.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("QuickSort")
public class QuickSortAlgorithm4 implements SortAlgorithm {
	
	public String sort(int[] numbers) {
		// Logic for Quick Sort
		return "QuickSortAlgorithm4";
	}

}
