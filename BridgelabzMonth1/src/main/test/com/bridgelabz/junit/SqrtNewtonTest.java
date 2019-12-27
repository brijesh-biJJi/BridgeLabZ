package com.bridgelabz.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class SqrtNewtonTest {

	@Test
	public void test()
	{
		int expected=2;
		int actual=(int) Utility.sqrtNewton(4);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test1()
	{
		int expected=4;
		int actual=(int) Utility.sqrtNewton(16);
		assertEquals(expected,actual);
	}

}
