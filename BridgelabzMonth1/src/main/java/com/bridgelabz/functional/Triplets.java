package com.bridgelabz.functional;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class Triplets 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Value");
		int n=InputScanner.inputInteger();
		int[] arr=Utility.getIntegerArray(n);
		Utility.displayIntegerArray(arr);
		int c=0;
		for(int i=0;i<arr.length-2;i++)
		{
			for (int j = i+1; j < arr.length-1; j++) 
				{	
				for (int k = j+1; k < arr.length; k++) 
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						c++;
						System.out.println("Triplates are "+arr[i] + " " +arr[j] +" "+ arr[k]+" = "+(arr[i] + arr[j] + arr[k]));
					}
				}
			}
		}
		System.out.println("Number of Triplets "+c);
	}
}
