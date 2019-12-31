package com.bridgelabz.basic;

import com.bridgelabz.inputscanner.InputScanner;

//Class FlipCoin is to check the Percentage of Head and Tail..
public class FlipCoin
{
	static int headc=0,tailc=0;
	static double r,tailper=0.0,headper=0.0;
	
	//Main method
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the range");
		int n=InputScanner.inputInteger();
		double[] per=percentage(n);
		System.out.println("Percentage of Tail "+per[0]);
		System.out.println("Percentage of Head "+per[1]);
	}
	
	//percentage method is used to check the percentage value od Head and Tail
	public static double[] percentage(int n) 
	{
		
		for(int i=0;i<n;i++)
		{
			r=Math.random();
			if(r<0.5)
			{
				tailc++;
				System.out.println("Tail");
			}
			else
			{
				headc++;
				System.out.println("Head");
			}
		}
		tailper=(tailc*100)/n;
		headper=(headc*100)/n;
		double[] per={tailper,headper};
		return per;
	}

}
