package com.bridgelabz.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class InsertionSortTest {

	@Test
	public void test() 
	{
		String[] expectedArray={"a","b","c","d","e"};
		String[] actualArray={"e","d","c","b","a"};
		assertArrayEquals(expectedArray, Utility.insertionSortString(actualArray));
	}

	
	@Test
	public void test1() 
	{
		String[] expectedArray={"abc","acb","b","bca","c","cd"};
		String[] actualArray={"cd","abc","c","acb","b","bca"};
		assertArrayEquals(expectedArray, Utility.insertionSortString(actualArray));
	}

}
