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
		al=getPrime(n);
		System.out.println(al);
	}
	public static ArrayList<Integer> getPrime(int n) 
	{
		for(int i=0;i<n;i++)
		{
			boolean rs=Utility.isPrime(i,2);
			if(rs)
				al.add(i);
		}
		return al;
	}
	
}
