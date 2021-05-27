package com.learningSpring.JunitTutorial.basic;

public class JunitSum {
	
	int sum(int[] numbers) {
		int total = 0;
		for (int i : numbers) {
			total += i;
		}
		return total;
	}
	
	int[] arrayCheck(int[] numbers) {
		return numbers;
	}

}
