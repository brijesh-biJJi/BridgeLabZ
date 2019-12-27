package com.bridgelabz.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BinarySwapTest {

	@Test
	public void test() 
	{
		int dec=100;
		int expected=70;
		int actual=Utility.swapBinary(dec);
		assertEquals(expected, actual);
	}

	
	@Test
	public void test1() 
	{
		int dec=106;
		int expected=166;
		int actual=Utility.swapBinary(dec);
		assertEquals(expected, actual);
	}

}
