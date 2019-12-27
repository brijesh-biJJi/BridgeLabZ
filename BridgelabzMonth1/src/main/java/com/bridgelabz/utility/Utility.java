package com.bridgelabz.utility;
import java.io.*;
import java.util.*;

import com.bridgelabz.inputscanner.InputScanner;

public class Utility 
{	
 
	
	public static BufferedReader getBufferReaderObject()
	{
		BufferedReader br = null;
		try 
		{
			br=new BufferedReader(new FileReader("D:\\GitBridgelabz\\bridgelabzLocal\\data.txt"));
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		}
		return br;
	}
	
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
	
	
	//Returns String Array
	public static String[] getStringArray(int n)
	{
		String[] strArray = new String[n];
		System.out.println("Enter the elements for array...");
		for(int i=0;i<n;i++)
		{
			strArray[i]=InputScanner.inputWord();
		}
		return strArray;
	}
	
	//Display String Array
	public static void displayStringArray(String[] strArray) 
	{
		for(int i=0;i<strArray.length;i++)
		{
			System.out.print(strArray[i]+" ");
		}
		System.out.println();
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

		
		
		//ALGORITHMS PROGRAMS
		
		//INSERTION SORT
		//Sort the String Array using Insertion Sort
		public static String[] insertionSortString(String[] strArray) 
		{
			for(int i=1;i<strArray.length;i++)
			{
				String ele=strArray[i];
				int j=i-1;
				while(j>=0 && (ele.compareTo(strArray[j])<0))
				{
					strArray[j+1]=strArray[j];
					j--;
				}
				strArray[j+1]=ele;
			}
			return strArray;
		}
		
		//Merge Sort Algorithm
		//Sort The Integer Array using Merge Sort
		
		//Merge Sort Function for Integer Array
		public static int[] mergeSort(int[] arr, int l, int h) 
		{
			if(l<h)
			{
				int m=(l+h)/2;
				mergeSort(arr,l,m);
				mergeSort(arr, m+1, h);
				merge(arr,l,m,h);
			}
			return arr;
		}

		//Merge Function For Integer Array
		public static void merge(int[] arr, int l, int m, int h) 
		{
			int[] temp=new int[h-l+1];
			int i=l,j=m+1,k=0;
				while(i<=m && j<=h)
				{
					if(arr[i]<arr[j])
						temp[k++]=arr[i++];
					else
						temp[k++]=arr[j++];
				}
				while(i<=m)
				{
					temp[k++]=arr[i++];
				}
				while(j<=h)
				{
					temp[k++]=arr[j++];
				}
				
			for(int a=0;a<temp.length;a++)
			{
				arr[l+a]=temp[a];
			}
			
		}

		//Merge Sort Function For String Array
		public static String[] mergeSortString(String[] arr, int l, int h) 
		{
			if(l<h)
			{
				int m=(l+h)/2;
				mergeSortString(arr,l,m);
				mergeSortString(arr, m+1, h);
				mergeString(arr,l,m,h);
			}
			return arr;
		}

		//Merge Function For String Array
		public static void mergeString(String[] arr, int l, int m, int h) 
		{
			String[] temp=new String[h-l+1];
			int i=l,j=m+1,k=0;
			while(i<=m && j<=h)
			{
				if(arr[i].compareTo(arr[j])<0)
					temp[k++]=arr[i++];
				else
					temp[k++]=arr[j++];
			}
			while(i<=m)
				temp[k++]=arr[i++];
						
			while(j<=h)
				temp[k++]=arr[j++];
						
			for(int a=0;a<temp.length;a++)
				arr[l+a]=temp[a];		
		}
		
		
		//Bubble Sort 
		//Sort Array using Bubble Sort
		public static int[] bubbleSort(int[] arr) 
		{
			for(int i=0;i<arr.length-1;i++)
				for (int j = 0; j <arr.length-i-1; j++) 
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
			return arr;
		}
		
		//Sort an Array using Selection sort
		public static void selectionSort(int[] arr) 
		{
			for(int i=0;i<arr.length;i++)
			{
				int ele=i;
				for (int j = i+1; j < arr.length; j++) 
				{
					if(arr[ele]>arr[j])
					{
						ele=j;
					}
				}
				int temp=arr[ele];
				arr[ele]=arr[i];
				arr[i]=temp;
			}
				
		}


		
		//Method to check Two Strings are Anagram or not...
		public static boolean isAnagram(String str1, String str2) 
		{
			char[] c1,c2;
			int[] count=new int[27];
			if(str1.length()!=str2.length())
				System.out.println("Not Anagram");
			
			c1=str1.toCharArray();
			c2=str2.toCharArray();
			
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]>='A' && c1[i]<='Z')
					count[c1[i]-65]++;
				
				if(c1[i]>='a' && c1[i]<='z')
					count[c1[i]-97]++;
			}
			
			for(int i=0;i<c2.length;i++)
			{
				if(c2[i]>='A' && c2[i]<='Z')
					count[c2[i]-65]--;
				
				if(c2[i]>='a' && c2[i]<='z')
					count[c2[i]-97]--;
			}
			
			for(int i=0;i<count.length;i++)
			{
				if(count[i]!=0)
					return false;
			}
		return true;
		}
		
		

		//Method to check Prime Number
		public static boolean isPrime(int n,int i) 
		{
			if(n%i==0)
				return false;
			if(i>n/2)
				return true;
			return isPrime(n,++i);
		}

	
		
		//Method to check Number is Palindrome or Not
		public static boolean isPalindrome(int n)
		{
			int rs=0,t=n;
			while(t!=0)
			{
				int r=t%10;
				rs=rs*10+r;
				t/=10;
			}
			return rs==n;
		}
		
		//Method to find guess number using Binary Search
		public static int binarySearch(int l, int h) 
		{
			if(h-l==1)
				return l;
				int m=(l+h)/2;
				System.out.println("Is a number less than : "+m+"\nEnter Yes or No");
				String s=InputScanner.inputWord();
				if(s.equals("yes"))
					return binarySearch(l, m);
				else 
					return binarySearch(m, h);
		}


		//Method to find the Permutation of a given String
		public static void permutation(String f, String uf) 
		{
			if(uf.length()==0)
				System.out.println(f);
			
			for(int i=0;i<uf.length();i++)
			{
				String fixed=f + uf.charAt(i);
				String unFixed=uf.substring(0,i) + uf.substring(i+1);
				permutation(fixed, unFixed);
			}
		}
		
		
		
		
		//Binary Search Function
		public static int binaryWordSearch(String[] stringArray, String word) 
		{
			int low=0,hi=stringArray.length-1;
			while(low<=hi)
			{
				int mid=(low+hi)/2;
				int res=word.compareTo(stringArray[mid]);
				if(res==0)
					return mid;
				else if(res>0)
					low=mid+1;
				else
					hi=mid-1;
			}
			return -1;
		}

		//Sorting the String Array without using Inbuilt Function
		public static void sortInOrder(String[] stringArray) 
		{
			for(int i=0;i<=stringArray.length-1;i++)
			{
				for (int j = i+1; j <stringArray.length; j++) 
				{
					if(stringArray[i].compareTo(stringArray[j])>0)
					{
						String temp=stringArray[i];
						stringArray[i]=stringArray[j];
						stringArray[j]=temp;
					}
				}
			}
		}
		
		
		
	/*public int[] getRandomIntArray(int num)
	{
		
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=rd.nextInt(100);
		return arr;
	}*/
}
