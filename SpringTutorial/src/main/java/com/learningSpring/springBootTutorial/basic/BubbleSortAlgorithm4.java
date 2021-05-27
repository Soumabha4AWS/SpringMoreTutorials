package com.learningSpring.springBootTutorial.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BubbleSort")
public class BubbleSortAlgorithm4 implements SortAlgorithm {

	public String sort(int[] numbers) {
		// Logic for Bubble Sort
		return "BubbleSortAlgorithm4";
	}

}
