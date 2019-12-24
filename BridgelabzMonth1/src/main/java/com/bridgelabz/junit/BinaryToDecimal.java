package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class BinaryToDecimal {

	public static void main(String[] args) 
	{
		System.out.println("Enter the decimal : ");
		int num=InputScanner.inputInteger();
		String bin=Utility.decToBin(num);
		System.out.println("Conversion from Decimal to Binary : "+bin);
		int t=Integer.parseInt(bin);
		
		int dec=Utility.binToDec(t);
		System.out.println("Conversion from Binary to Decimal : "+dec);
	}

}
