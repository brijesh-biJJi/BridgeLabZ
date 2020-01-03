package com.bridgelabz.DataStructures;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramQueueUsingLinkedList extends PrimeAnagramTwoDimensionalArray
{

	public static void main(String[] args) 
	{
		QueueUsingLinkedList ql=new QueueUsingLinkedList();
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
			ql.enQueue(alAna.get(i));
		}
		
		System.out.println(ql);
		System.out.println(ql.deQueue());
		System.out.println(ql);
		ql.enQueue(10001);
		System.out.println(ql);
	}

}
