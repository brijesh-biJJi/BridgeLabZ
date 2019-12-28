package com.bridgelabz.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class DayOfWeekTest {

	@Test
	public void test() 
	{
		Utility.setDayMonthYear(28,12,2019);
		String actual=Utility.getDayName();
		String expected="Sat";
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1() 
	{
		Utility.setDayMonthYear(13,9,1994);
		String actual=Utility.getDayName();
		String expected="Tue";
		assertEquals(expected, actual);
	}

}
