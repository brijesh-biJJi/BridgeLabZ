package com.bridgelabz.basic;


import com.bridgelabz.inputscanner.InputScanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		int year;
		System.out.println("enter the Year");
		year=InputScanner.inputInteger();
		boolean r=isValid(year);
		if(r)
		{
			System.out.println("Number should be 4 digit");
		}
		else
		{
			boolean rs=isLeap(year);
			if(rs)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
		}
	}
	
	public static boolean isLeap(int year) 
	{
		return (year%400==0 || (year%4==0 && year%100!=0));

	}
	
	public static boolean isValid(int y)
	{
		if(y==0)
			return true;
		int c=0;
		while(y>0){
			c++;
			y/=10;
		}
		return (c!=4);
	}

}
