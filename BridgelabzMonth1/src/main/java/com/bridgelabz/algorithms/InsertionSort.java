package com.bridgelabz.algorithms;


import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) 
	{	
		System.out.println("Enter the size for array..");
		int n=InputScanner.inputInteger();
		String[] strArray=Utility.getStringArray(n);
		
		//Before Sorting
		System.out.println("Before Sorting");
		Utility.displayStringArray(strArray);
		System.out.println();
		
		//Sort the String using Insertion Sort 
		Utility.insertionSortString(strArray);
		
		System.out.println("After Sorting");
		Utility.displayStringArray(strArray);
	}
}
