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
		System.out.println("Prime Numbers With Palindrome......");
		for(int i=0;i<n;i++)
		{
			boolean pr=Utility.isPrime(i,2);
			if(pr){
				alPrime.add(i);
				boolean pal=Utility.isPalindrome(i);
				if(pal)
					System.out.println(i);
			}
			
		}	
		System.out.println("Prime Numbers......");
		System.out.println(alPrime);
		System.out.println();
	
		System.out.println("Prime numbers with Anagram..");
		isAna(alPrime);
	
		System.out.println();
		
		//isPali(alPrime);
		//System.out.println(alPali);
	}
	
	//To check Palindrome
	/*public static void isPali(ArrayList<Integer> alPrime)
	{
		for (int i = 0; i < alPrime.size(); i++) 
		{
			boolean pal=Utility.isPalindrome(i);
			if(pal)
				System.out.println(i);
		}
	}*/
	
	
	
	
	//To check Anagram
	public static void isAna(ArrayList<Integer> alPrime) 
	{
		for (int i = 0; i < alPrime.size(); i++) 
		{
			for (int j = 0; j < alPrime.size(); j++) 
			{
				if(i!=j)
				{
					if(Utility.isAnagramBuiltIn(String.valueOf(alPrime.get(i)), String.valueOf(alPrime.get(j))))
					{
						System.out.println(alPrime.get(i)+" --> "+alPrime.get(j));
					}
				}
			}
		}
	}
}
