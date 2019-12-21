package com.bridgelabz.utility;
import java.io.*;
import java.util.*;

import com.bridgelabz.inputscanner.InputScanner;

public class Utility 
{	
	//Return ArrayList Object
	public static  ArrayList<Integer> getArrayListObject()
	{
		return new ArrayList<Integer>();
	}
	
	static PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
	//Random rd=new Random();

	//Returns Integer Array
	public static int[] getIntegerArray(int n)
	{
		int[] arr=new int[n];
		System.out.println("Enter the Value");
		for(int i=0;i<n;i++)
			arr[i]=InputScanner.inputInteger();
		return arr;
	}
	
	
	//Display Integer Array
	public static void displayIntegerArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
	
	//Returns Two Dimensional Integer Array
	public static int[][] get2DIntegerArray()
	{
		int r,c;
		System.out.println("Enter the Row And Column");
		r=InputScanner.inputInteger();
		c=InputScanner.inputInteger();
		int[][] ar=new int[r][c];
		
		System.out.println("Enter the Value for Row and Column");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				ar[i][j]=InputScanner.inputInteger();
		return ar;
	}
	
	//Display Two Dimensional Integer Array
	public static void display2DIntegerArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				pw.print(arr[i][j]+" ");
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
	
	
	
	/*public int[] getRandomIntArray(int num)
	{
		
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=rd.nextInt(100);
		return arr;
	}*/
}
