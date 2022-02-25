package com.test.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class BusinessClassMockTest {

	@Test
	public void testGeatest() {
		
		DataService mockData = mock(DataService.class);
		when(mockData.getAllDate()).thenReturn(new int [] {10,20,37});
		BusinessClass businessClass = new BusinessClass(mockData);
		int result = businessClass.retrieveGratest();
		assertEquals(35, result);
	}

}
