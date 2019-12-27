package com.bridgelabz.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class MergeSortStringTest {

	@Test
	public void test() 
	{
		String[] expectedArray={"a","b","c","d","e"};
		String[] actualArray={"e","d","c","b","a"};
		assertArrayEquals(expectedArray, Utility.mergeSortString(actualArray,0,actualArray.length-1));
	}

	
	@Test
	public void test1() 
	{
		String[] expectedArray={"abc","acb","b","bca","c","cd"};
		String[] actualArray={"cd","abc","c","acb","b","bca"};
		assertArrayEquals(expectedArray, Utility.mergeSortString(actualArray,0,actualArray.length-1));
	}
	
	@Test
	public void testPosNumber() 
	{
		int[] a={5,4,3,2,1};
		int[] expectedArray={1,2,3,4,5};
		assertArrayEquals(expectedArray,  Utility.mergeSort(a, 0, a.length-1));
		
	}
	

	@Test
	public void testNegNumber() 
	{
		int[] a={-4,-2,-3,-1,-5};
		int[] expectedArray={-5,-4,-3,-2,-1};
		assertArrayEquals(expectedArray,  Utility.mergeSort(a, 0, a.length-1));
	}

}
