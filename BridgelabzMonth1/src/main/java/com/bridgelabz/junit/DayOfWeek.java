package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Day, Month, and Year");
		int d=InputScanner.inputInteger();
		int m=InputScanner.inputInteger();
		int y=InputScanner.inputInteger();
		
		Utility.setDayMonthYear(d,m,y);
		String dayName=Utility.getDayName();
		System.out.println(dayName);
	}	
}
