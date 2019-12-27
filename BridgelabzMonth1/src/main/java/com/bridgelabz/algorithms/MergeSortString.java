package com.bridgelabz.algorithms;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class MergeSortString {

	public static void main(String[] args)
	{
		System.out.println("Enter the size of an array");
		int n=InputScanner.inputInteger();
		
		String[] arr=Utility.getStringArray(n);
		
		
		
		//Before Sorting
		System.out.println("Before Sorting");
		Utility.displayStringArray(arr);
		System.out.println();
				
			 
		//Calling Merge Sort Function
		Utility.mergeSortString(arr,0,n-1);
		
		
		//Display Array After Sorting
		System.out.println("After Sorting");
		Utility.displayStringArray(arr);
	}
}
