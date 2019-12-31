package com.bridgelabz.basic;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void given_2020_as_Input_then_returns_true_asOutput() 
	{
		boolean expected=true,actual;
		actual=LeapYear.isLeap(2020);
		assertEquals(expected,actual);
	}
	
	@Test
	public void given_2015_as_Input_then_returns_false_asOutput() 
	{
		boolean expected=false,actual;
		actual=LeapYear.isLeap(2015);
		assertEquals(expected,actual);
	}

	
}
