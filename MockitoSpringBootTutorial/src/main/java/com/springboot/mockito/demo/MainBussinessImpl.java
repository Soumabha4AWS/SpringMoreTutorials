package com.springboot.mockito.demo;

public class MainBussinessImpl {

	private MainDataService dataService;
	
	

	public MainBussinessImpl(MainDataService dataService) {
		super();
		this.dataService = dataService;
	}



	int findGreatestFromAllData() {
		
		int[] allData = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for (int value : allData) {
			if (value > greatest) {
				greatest = value;
			}
		}
		
		return greatest;
	}

}
