package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class SqrtNewton {

	public static void main(String[] args) 
	{
		double c;
		System.out.println("Enter the positive number");
		c=InputScanner.inputDouble();
		System.out.println(Utility.sqrtNewton(c));
	}
}
