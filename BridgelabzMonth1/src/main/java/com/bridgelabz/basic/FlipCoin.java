package com.bridgelabz.basic;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

//Class FlipCoin is to check the Percentage of Head and Tail..
public class FlipCoin
{
	//Main method
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the range");
		int n=InputScanner.inputInteger();
		double[] per=Utility.percentage(n);
		System.out.println("Percentage of Tail "+per[0]);
		System.out.println("Percentage of Head "+per[1]);
	}
}
