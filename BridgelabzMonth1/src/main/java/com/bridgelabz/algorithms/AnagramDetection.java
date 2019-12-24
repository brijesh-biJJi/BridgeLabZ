package com.bridgelabz.algorithms;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class AnagramDetection 
{
	public static void main(String[] args) 
	{
		String str1,str2;
		System.out.println("Enter the String1..");
		str1=InputScanner.inputWord();
		
		System.out.println("Enter the String2..");
		str2=InputScanner.inputWord();
		
		boolean rs=Utility.isAnagram(str1,str2);
		if(rs)
			System.out.println("Anagram...");
		else
			System.out.println("Not Anagram..");		
	}
}
