package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

//class is used to Count the possibility of Binary Tree of N nodes given  
public class BinarySearchTree
{
	//countTree method is used to count the tree
	public static long countTree(int n) 
	{
		if(n==0 || n==1)
			return 1;
		else
		{
			long sum=0,left=0,right=0;
			for (int k = 1; k <= n; k++) 
			{
				left=countTree(k-1);
				right=countTree(n-k);
				sum +=left*right;
			}
			return sum;
		}
		
		
	}
	public static void main(String[] args)
	{
		long count=0;
		System.out.println("Enter the range between 1 to 10");
		int n=InputScanner.inputInteger();
		
		int[] arr=Utility.getIntegerArray(n);
		
		for (int i = 0; i < arr.length; i++)
		{
			count =countTree(arr[i]);
			System.out.println(count);
		}
		
	}

	

}
