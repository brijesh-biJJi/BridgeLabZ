package com.bridgelabz.DataStructures;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramTwoDimensionalArray 
{
	static int[][] primeArray;
	//Method used to store Prime Number that are Anagram
	public static int[][] storePrimeAnagram(ArrayList<Integer> al)         
	{
	int len=al.size();
	primeArray=new int[10][len];
		for (int i = 0; i < primeArray.length; i++) 
		{
			for (int j = 0; j < len; j++) 
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
		return primeArray;
	}
	
	//Main method to perform the task
	public static void main(String[] args) 
	{
		ArrayList<Integer> alPrime=new ArrayList<>();
		ArrayList<Integer> alAna=new ArrayList<>();
		System.out.println("Enter the range..");
		int n=InputScanner.inputInteger();
		PrimeTwoDimensionalArray pArray=new PrimeTwoDimensionalArray();
		for (int i = 0; i <= n; i++) 
		{
			boolean rs=Utility.isPrime(i,2);
			if(rs)
				alPrime.add(i);
		}
		
		alAna=isAnagram(alPrime);
		int[][] primeArray=storePrimeAnagram(alAna);
		displayPrimeAnagram(primeArray);
	}
	
	public static void displayPrimeAnagram(int[][] primeArray) 
	{
		//Display the Prime number that are Anagram
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

	//To check the prime number Anagram or not
		public static ArrayList<Integer> isAnagram(ArrayList<Integer> alPrime) 
		{
			ArrayList<Integer> alAna=new ArrayList<>();
			for (int i = 0; i < alPrime.size(); i++) 
			{
				for (int j = 0; j < alPrime.size(); j++) 
				{
					if(i!=j)
					{
						if(Utility.isAnagramBuiltIn(String.valueOf(alPrime.get(i)), String.valueOf(alPrime.get(j))))
						{
							if(!alAna.contains(alPrime.get(i)))
								alAna.add(alPrime.get(i));
						}
					}
				}
			}
			return alAna;
		}
}
