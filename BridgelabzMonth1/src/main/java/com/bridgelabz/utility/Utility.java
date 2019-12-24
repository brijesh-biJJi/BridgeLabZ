package com.bridgelabz.utility;
import java.io.*;
import java.util.*;

import com.bridgelabz.inputscanner.InputScanner;

public class Utility 
{	
	
	static int dd,mm,yy;
	static int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	//Initialize Day Month And Year
	public static void setDayMonthYear(int d, int m, int y) 
	{
		dd=d;
		mm=m;
		yy=y;
		if(yy%400==0 || yy%4==0 && yy%100!=0)
			month[2]=29;
	}
	
	//Count Total no of Days
	private static int noOfDay()
	{
		int y=yy-1;
		int day=y*365;
		day +=y/400+y/4-y/100;
		for(int i=1;i<mm;i++)
			day +=month[i];
		day +=dd;
		return day;
	}

	//Get Day Name
	public static  String getDayName() 
	{
		String[] dayName={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int totalDays=noOfDay();
		return dayName[totalDays%7];
	}
	
	
	
	//Return ArrayList Object
	public static  ArrayList<Integer> getArrayListObject()
	{
		return new ArrayList<Integer>();
	}
	
	static PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
	//Random rd=new Random();

	//Returns Integer Array
	public static int[] getIntegerArray(int n)
	{
		int[] arr=new int[n];
		System.out.println("Enter the Value");
		for(int i=0;i<n;i++)
			arr[i]=InputScanner.inputInteger();
		return arr;
	}
	
	
	//Display Integer Array
	public static void displayIntegerArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
	
	//Returns Two Dimensional Integer Array
	public static int[][] get2DIntegerArray()
	{
		int r,c;
		System.out.println("Enter the Row And Column");
		r=InputScanner.inputInteger();
		c=InputScanner.inputInteger();
		int[][] ar=new int[r][c];
		
		System.out.println("Enter the Value for Row and Column");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				ar[i][j]=InputScanner.inputInteger();
		return ar;
	}
	
	//Display Two Dimensional Integer Array
	public static void display2DIntegerArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				pw.print(arr[i][j]+" ");
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}

	//Temperature from Fahrenheit To Celsius
	public static double fahrenToCelsius(double tf) 
	{
		return (tf-32)*5/9;
	}
	
	//Temperature from Celsius To Fahrenheit
	public static double celsiusToFahren(double tc) 
	{
		return (tc*(9/5))+32;
	}

	
	//Finding Square Root Using Newtons Method
	public static double sqrtNewton(double c) 
	{
		double t,epsilon=1e-15;
		t=c;
		while(Math.abs(t-(c/t)) > epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		return t;
	}
	
	
	//Conversion from Binary to Decimal
		public static int binToDec(int t) 
		{
			int sum=0,i=0;
			while(t!=0)
			{
				int r=t%10;
				sum=sum+(r*pow(2,i++));
				t /=10;
			}
			return sum;
		}

		//Finding pow of a number
		private static int pow(int n, int p) 
		{
			int res=1;
			while(p>0)
			{
				res=res*n;
				p--;
			}
			return res;
		}

		//Conversion from  Decimal To Binary
		public static String decToBin(int num) 
		{
			String res="";
			while(num!=0)
			{
				int r=num%2;
				res=r+res;
				num/=2;
			}
			return res;
		}

		//Swap Nibbles in Binary
		public static int swapBinary(int num) 
		{
			return ((num & 0x0F) << 4 | (num & 0xF0)>>4);
		}

		
	/*public int[] getRandomIntArray(int num)
	{
		
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=rd.nextInt(100);
		return arr;
	}*/
}
