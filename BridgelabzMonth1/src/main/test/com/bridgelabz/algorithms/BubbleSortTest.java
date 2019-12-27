package com.bridgelabz.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BubbleSortTest {

	@Test
	public void testPosNumber() 
	{
		int[] a={5,4,3,2,1};
		int[] expectedArray={1,2,3,4,5};
		assertArrayEquals(expectedArray,  Utility.bubbleSort(a));
		
	}
	

	@Test
	public void testNegNumber() 
	{
		int[] a={-4,-2,-3,-1,-5};
		int[] expectedArray={-5,-4,-3,-2,-1};
		assertArrayEquals(expectedArray,  Utility.bubbleSort(a));
	}
}
