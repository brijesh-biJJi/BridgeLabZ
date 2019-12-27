package com.bridgelabz.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.Test;

import com.bridgelabz.utility.Utility;

public class StringPermutationTest 
{
ArrayList<String> al=new ArrayList<>();
	
	@Test
	public void test()
	{
		al.add("abc");
		al.add("acb");
		al.add("bac");
		al.add("bca");
		al.add("cab");
		al.add("cba");
		String word="abc";
		assertIterableEquals(al, Utility.permutation("",word));
	}

}
