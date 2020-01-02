package com.bridgelabz.DataStructures;

import java.util.*;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

//PrimeTwoDimensionalArray Class is used find the prime number and store it in 2D array
public class PrimeTwoDimensionalArray 
{
	public static void storePrime(ArrayList<Integer> al, int len) 
	{
		int[][] primeArray=new int[10][168];
		for (int i = 0; i < primeArray.length; i++) 
		{
			for (int j = 0; j < 168; j++) 
			{
				if(i==0 && (al.get(j)>0 && al.get(j)<=100))
					primeArray[i][j]=al.get(j);
				
				if(i==1 && (al.get(j)>100 && al.get(j)<=200))
					primeArray[i][j]=al.get(j);
				
				if(i==2 && (al.get(j)>200 && al.get(j)<=300))
					primeArray[i][j]=al.get(j);
				
				if(i==3 && (al.get(j)>300 && al.get(j)<=400))
					primeArray[i][j]=al.get(j);
				
				if(i==4 && (al.get(j)>400 && al.get(j)<=500))
					primeArray[i][j]=al.get(j);
				
				if(i==5 && (al.get(j)>500 && al.get(j)<=600))
					primeArray[i][j]=al.get(j);
				
				if(i==6 && (al.get(j)>600 && al.get(j)<=700))
					primeArray[i][j]=al.get(j);
				
				if(i==7 && (al.get(j)>700 && al.get(j)<=800))
					primeArray[i][j]=al.get(j);
				
				if(i==8 && (al.get(j)>800 && al.get(j)<=900))
					primeArray[i][j]=al.get(j);
				
				if(i==9 && (al.get(j)>900 && al.get(j)<=1000))
					primeArray[i][j]=al.get(j);
			}
		}
		
		
		for (int i = 0; i < primeArray.length; i++)
		{
			for (int j = 0; j < primeArray[i].length; j++) 
			{
				if(primeArray[i][j]!=0)
					System.out.print(primeArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//Main method to perform the task
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Enter the range..");
		int n=InputScanner.inputInteger();
		PrimeTwoDimensionalArray pArray=new PrimeTwoDimensionalArray();
		for (int i = 0; i <= n; i++) 
		{
			boolean rs=Utility.isPrime(i,2);
			if(rs)
				al.add(i);
		}
		int len=al.size();
		//System.out.println(al);
		storePrime(al,len);
		
	}

	

}
