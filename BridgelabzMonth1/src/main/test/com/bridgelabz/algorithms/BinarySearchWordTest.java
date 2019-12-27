package com.bridgelabz.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class BinarySearchWordTest {

	@Test
	public void test() 
	{
		int expected=2;
		String word="java";
		String[] stringArray={"a","is","java","language","programming"};
		assertEquals(expected,Utility.binaryWordSearch(stringArray,word));
	}
	
	@Test
	public void test1() 
	{
		int expected=4;
		String word="programming";
		String[] stringArray={"a","is","java","language","programming"};
		assertEquals(expected,Utility.binaryWordSearch(stringArray,word));
	}

}
