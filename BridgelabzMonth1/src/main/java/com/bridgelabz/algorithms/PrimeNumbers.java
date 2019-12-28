package com.bridgelabz.algorithms;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeNumbers {
static ArrayList<Integer> al=new ArrayList<>();
	public static void main(String[] args) 
	{
		
	
		System.out.println("Enter the Range..");
		int n=InputScanner.inputInteger();
		System.out.println("Prime NUmbers Are....");
		for(int i=0;i<n;i++)
		{
			boolean rs=Utility.isPrime(i,2);
			if(rs)
			{
				System.out.println(i);
				al.add(i);
			}
				
		}
	}
	public static ArrayList<Integer> getPrime()
	{
		return al;	
	}
}
