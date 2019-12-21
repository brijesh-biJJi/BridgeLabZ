package com.bridgelabz.basic;

import java.util.*;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class PrimeFactor 
{
	public static void main(String[] args) 
	{
		List<Integer> al=Utility.getArrayListObject();
		System.out.println("enter the number");
		int n=InputScanner.inputInteger();
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				if(al.contains(i))
					al.add(i);
				else
				{
					al.add(i);
					System.out.println(i);
				}
				n/=i;
			}
		}
		if(n>2)
			System.out.println(n);
		System.out.println(al);
	}
}
