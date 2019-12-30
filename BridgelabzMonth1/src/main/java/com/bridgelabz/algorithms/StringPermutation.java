package com.bridgelabz.algorithms;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

//Class to find Permutation of a given String
public class StringPermutation 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the String..");
		String str=InputScanner.inputWord();
		System.out.println();
		Utility.permutation("",str);
	}
}
