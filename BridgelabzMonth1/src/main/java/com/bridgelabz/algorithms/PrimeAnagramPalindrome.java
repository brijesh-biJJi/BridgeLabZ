package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramPalindrome {
static ArrayList<Integer> alPali,alAna,alPrime;
	public static void main(String[] args) 
	{
		alPrime=new ArrayList<>();
		alPali=new ArrayList<>();
		alAna=new ArrayList<>();
		System.out.println("Enter the Range..");
		int n=InputScanner.inputInteger();
		//To check Prime Or Not
		for(int i=0;i<n;i++)
		{
			boolean pr=Utility.isPrime(i,2);
			if(pr)
			{
				alPrime.add(i);
				//To check Palindrome
				boolean pal=Utility.isPalindrome(i);
				if(pal)
					alPali.add(i);
			}
		}	
		/*System.out.println("Prime Numbers......");
		System.out.println(alPrime);
		System.out.println();
		
		System.out.println("Prime Numbers With Palindrome......");
		System.out.print(alPali);*/
		//isAna(alPrime);
		
		for (int i = 0; i < alPrime.size(); i++) 
		{
			for (int j = 0; j < alPrime.size(); j++) 
			{
				if(i!=j)
				{
					if(Utility.isAnagramBuiltIn(String.valueOf(alPrime.get(i)), String.valueOf(alPrime.get(j))))
					{
						System.out.println(i+" --> "+j);
					}
				}
			}
		}
		
	}
	
	//To check Anagram
	/*public static void isAna(ArrayList<Integer> alPrime) 
	{
		for (int i = 0; i < alPrime.size(); i++) 
		{
			for (int j = 0; j < alPrime.size(); j++) 
			{
				if(i!=j)
				{
					if(Utility.isAnagram(String.valueOf(i), String.valueOf(j)))
							{
						System.out.println(i+" --> "+j);
							}
				}
			}
		}
	}*/
}
