package com.test.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class BusinessClassAnnotationsMockTest {

	@Mock
	DataService mockData;
	
	@InjectMocks
	BusinessClass businessClass;
	
	@Test
	public void testGeatest() {
		
		//DataService mockData = mock(DataService.class);
		when(mockData.getAllDate()).thenReturn(new int [] {10,20,35});
		//BusinessClass businessClass = new BusinessClass(mockData);
		int result = businessClass.retrieveGratest();
		assertEquals(35, result);
	}

}
