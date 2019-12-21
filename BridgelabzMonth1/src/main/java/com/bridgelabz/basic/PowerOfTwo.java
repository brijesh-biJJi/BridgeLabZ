package com.bridgelabz.basic;

import com.bridgelabz.inputscanner.InputScanner;

public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		System.out.println("Entert the range");
		int n=InputScanner.inputInteger();
		if(n<=0 && n>31)
		{	
			System.out.println("Range must be within 31");
			return ;
		}
		for(int i=0;i<=n;i++)
		{
			int pot=powerOfTwo(2,i);
			System.out.println(pot);
			if(i==n)
			{
				if(pot%400==0 || pot%4==0 && pot%100!=0)
					System.out.println("Leap Year");
				else
					System.out.println("Not Leap Year");
			}
			
		}
	}
	private static int powerOfTwo(int n, int p) 
	{
		int res=1;
		while(p>0)
		{
			res*=n;
			p--;
		}
		return res;
	}
}
