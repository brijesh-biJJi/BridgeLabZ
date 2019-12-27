package com.bridgelabz.algorithms;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of an Array..");
		int n=InputScanner.inputInteger();
		
		//REad the array
		int[] arr=Utility.getIntegerArray(n);
		
		//Display The Array Before Sorting
		System.out.println("Before Sorting");
		Utility.displayIntegerArray(arr);
		System.out.println();
		
		//Calling Bubble Sort function
		int[] aa=Utility.bubbleSort(arr);
		
		//Display The Array After Sorting
		System.out.println("After Sorting");
		Utility.displayIntegerArray(aa);
	}
}
