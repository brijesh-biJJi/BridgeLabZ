package com.bridgelabz.basic;

import com.bridgelabz.inputscanner.InputScanner;

public class Harmonic 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the range");
		int n=InputScanner.inputInteger();
		double h=harmonic(n);
		System.out.println("Nth Term "+h);
	}

	private static double harmonic(int n)
	{
		double h=0.0;
		for(int i=1;i<=n;i++)
		{
			h=1.0/i;
			System.out.println(h);
		}
		return h;
	}
}
