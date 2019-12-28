package com.bridgelabz.junit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BinaryToDecimalTest {

	@Test
	public void test() 
	{
		String expected="1101010";
		int num=106;
		String actual=Utility.decToBin(num);
		assertEquals(expected,actual);
	}

}
