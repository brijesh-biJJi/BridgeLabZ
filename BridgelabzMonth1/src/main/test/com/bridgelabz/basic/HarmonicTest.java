package com.bridgelabz.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class HarmonicTest 
{

	@Test
	public void given10_whenHarmonic_thenShouldBeZeroPointOne() 
	{
		double expected=0.1,actual;
		actual=Harmonic.harmonic(10);
		assertEquals(expected,actual,0);
	}
	
	@Test
	public void given5_whenHarmonic_thenShouldBeZeroPointTwo() 
	{
		double expected=0.2,actual;
		actual=Harmonic.harmonic(5);
		assertEquals(expected,actual,0);
	}

}
