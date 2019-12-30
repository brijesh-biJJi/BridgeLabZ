package com.bridgelabz.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthlyPaymentTest {

	
	@Test
	public void test() 
	{
		double expected=179.6869066406349;
		double actual=MonthlyPayment.calculateMonthlyPay(10000,5,3);
		assertEquals(expected, actual,0);
	}

}
