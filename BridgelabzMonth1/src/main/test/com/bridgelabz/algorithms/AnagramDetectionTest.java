package com.bridgelabz.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class AnagramDetectionTest {

	@Test
	public void test() 
	{
		boolean expected=true;
		String str1,str2;
		str1="heart";
		str2="earth";
		assertEquals(expected,Utility.isAnagram(str1,str2));
	}
	
	@Test
	public void test1() 
	{
		boolean expected=true;
		String str1,str2;
		str1="hitler woman";
		str2="mother in law";
		assertEquals(expected,Utility.isAnagram(str1,str2));
	}
	
	@Test
	public void test2() 
	{
		boolean expected=false;
		String str1,str2;
		str1="peak";
		str2="keep";
		assertEquals(expected,Utility.isAnagram(str1,str2));
	}

}
