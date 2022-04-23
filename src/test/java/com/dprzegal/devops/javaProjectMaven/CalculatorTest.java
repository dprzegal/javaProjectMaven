package com.dprzegal.devops.javaProjectMaven;

import static org.junit.Assert.*;


import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator myCalc = new Calculator();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}
	
	@Test
	public void subtractTest() {
		Calculator myCalc = new Calculator();
		assertEquals(5, myCalc.subtract(10, 5));
	}

	@Test
	public void productTest() {
		Calculator myCalc = new Calculator();
		assertEquals(50, myCalc.product(10, 5));	
	}
}
