package com.bridgelabz.algorithms;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramPalindrome {
static ArrayList<Integer> al=new ArrayList<>();
	public static void main(String[] args) 
	{
		System.out.println("Enter the Range..");
		int n=InputScanner.inputInteger();
		System.out.println("Prime NUmbers Are....");
		//To check Prime Or Not
		for(int i=0;i<n;i++)
		{
			boolean pr=Utility.isPrime(i,2);
			if(pr)
			{
				boolean pal=Utility.isPalindrome(i);
				if(pal){
					System.out.println(i);
					al.add(i);
				}
			}
		}	
		System.out.println();
		System.out.print(al+" ");
	}
}
