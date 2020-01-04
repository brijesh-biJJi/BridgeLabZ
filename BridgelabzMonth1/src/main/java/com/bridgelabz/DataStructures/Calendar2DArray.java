package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class Calendar2DArray 
{
static int[][] cal=new int[6][7];
	
	//storeDate is used to store the date in 2D Array
	public static int[][] storeDate(int firstDay,int mm)
	{
		int start=1;
		for (int i = 0; i < 6; i++)
		{
	
			for (int j = 0; j < 7; j++) 
			{
				if(start<=mm)
					cal[i][j]=firstDay-- >0 ? 0 : start++;	
			}
		}
		return cal;   
	}
	
	//Display the calendar
	public static void displayCalendar(int[][] cal)
	{
		String nameOfTheWeeks = "Sun\t" + "Mon\t" + "Tue\t" + "Wed\t" + "Thu\t" + "Fri\t" + "Sat\t";
        System.out.println(nameOfTheWeeks);

		for (int i = 0; i < 6; i++) 
		{
		    for (int j = 0; j < 7; j++) 
		    {
		        System.out.print((cal[i][j] == 0 ? " " : cal[i][j]) + "\t");  // replace 0's in the array with spaces
		        
		    }
		    System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Day, Month, and Year");
		int d=InputScanner.inputInteger();
		int m=InputScanner.inputInteger();
		int y=InputScanner.inputInteger();
		
		Utility.setDayMonthYear(d,m,y);
		int[] noOfDay=Utility.noOfDay();
		int firstDay=noOfDay[0]%7;
		int mm=noOfDay[1];
		int[][] calendar=storeDate(firstDay,mm);
		displayCalendar(calendar);
	}
}
