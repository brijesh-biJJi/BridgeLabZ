package com.bridgelabz.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class TemperatureConversionTest {

	@Test
	public void test() {
		double actual=Utility.fahrenToCelsius(130);
		double expected=54.44444444444444;
		assertEquals(expected,actual,0);
	}

}
