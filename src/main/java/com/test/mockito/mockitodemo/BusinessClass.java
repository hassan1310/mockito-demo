package com.test.mockito.mockitodemo;

public class BusinessClass {
	
	DataService dataService;
	
	
	public BusinessClass(DataService dataService) {
		this.dataService=dataService;
	}
	
	public int retrieveGratest() {
		int greatstNum =Integer.MIN_VALUE;
		int allData [] =dataService.getAllDate();
		for (int value : allData) {
			if (value>greatstNum) {
				greatstNum=value;	
			}
		}
		return greatstNum;
	}

}
