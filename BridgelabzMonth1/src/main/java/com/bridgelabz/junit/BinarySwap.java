package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class BinarySwap 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the decimal : ");
		int num=InputScanner.inputInteger();
		System.out.println("Swap Nibble in Binary : "+Utility.swapBinary(num));
	}

	
}
