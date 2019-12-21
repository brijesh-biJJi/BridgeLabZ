package com.bridgelabz.basic;

import com.bridgelabz.inputscanner.InputScanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		int c=0,year,n;
		System.out.println("enter the Year");
		year=InputScanner.inputInteger();
		n=year;
		while(n>0){
			c++;
			n/=10;
		}
		if(c!=4){
			System.out.println("Number should be 4 digit");
			return;
		}
		boolean rs=isLeap(year);
		if(rs)
			System.out.println("Leap Year");
		else
			System.out.println("NOt a Leap Year");
	}
	private static boolean isLeap(int year) 
	{
		if(year%400==0 || (year%4==0 && year%100!=0))
			return true;
		else
			return false;
	}


}
