package com.bridgelabz.DataStructures;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramStackUsingLinkedList extends PrimeAnagramTwoDimensionalArray
{

	public static void main(String[] args) 
	{
		StackUsingLinkedList sl=new StackUsingLinkedList();
		ArrayList<Integer> alPrime=new ArrayList<>();
		ArrayList<Integer> alAna=new ArrayList<>();
		System.out.println("Enter the range..");
		int n=InputScanner.inputInteger();
		for (int i = 0; i <= n; i++) 
		{
			boolean rs=Utility.isPrime(i,2);
			if(rs)
				alPrime.add(i);
		}
		
		alAna=isAnagram(alPrime);
		
		
		for (int i = 0; i < alAna.size(); i++) 
		{
			sl.push(alAna.get(i));
		}
		
		System.out.println(sl);
		System.out.println(sl.pop());
		System.out.println(sl);
		sl.reverseList();
		System.out.println(sl);
	}

}
