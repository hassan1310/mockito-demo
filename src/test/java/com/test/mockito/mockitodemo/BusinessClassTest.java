package com.test.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BusinessClassTest {

	@Test
	public void testGeatest() {
		BusinessClass businessClass = new BusinessClass(new DataServiceImpl());
		int result = businessClass.retrieveGratest();
		assertEquals(35, result);
	}

}
