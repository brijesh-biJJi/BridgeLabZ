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
		
		//Anagram for Integer
		/*int a,b;
		System.out.println("Enter the num");
		a=InputScanner.inputInteger();
		b=InputScanner.inputInteger();
		boolean rsi=Utility.isAnagramBuiltIn(String.valueOf(a),String.valueOf(b));
		if(rsi)
			System.out.println("Anagram...");
		else
			System.out.println("Not Anagram..");	*/
		
		
		//Using Built-In Function
		//boolean rs=Utility.isAnagramBuiltIn(str1,str2);
		
		boolean rs=Utility.isAnagram(str1,str2);
		if(rs)
			System.out.println("Anagram...");
		else
			System.out.println("Not Anagram..");		
	}
}
