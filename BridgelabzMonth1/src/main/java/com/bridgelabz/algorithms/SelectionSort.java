package com.bridgelabz.algorithms;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class SelectionSort {

	public static void main(String[] args)
	{
		System.out.println("Enter the size of an Array...");
		int n=InputScanner.inputInteger();
		
		//REad the array
		int[] arr=Utility.getIntegerArray(n);
		
		//Display The Array Before Sorting
		System.out.println("Before Sorting");
		Utility.displayIntegerArray(arr);
		System.out.println();
		
		//Calling Selection Sort function
		Utility.selectionSort(arr);
		
		//Display The Array After Sorting
		System.out.println("After Sorting");
		Utility.displayIntegerArray(arr);
	}
}
