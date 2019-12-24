package com.bridgelabz.algorithms;

import java.io.BufferedReader;
import java.io.IOException;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class BinarySearchWord
{
	public static void main(String[] args) 
	{
		BufferedReader br=Utility.getBufferReaderObject();
		String[] stringArray = null;
		String str="";
		try 
		{
			while(br.readLine()!=null)
			{
				str=br.readLine();
				stringArray=str.split(",");	
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]+" ");
		}
		
		System.out.println();
		
		
		//Sorting String Array using Inbuilt Function
		/*Arrays.sort(stringArray);
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]+" ");
		}
		System.out.println();
		*/
		
		
		//Sorting the String Array without using Inbuilt Function
		sortInOrder(stringArray);
		
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]+" ");
		}
		
		System.out.println("\nEnter the word to search..!");
		String word=InputScanner.inputWord();
		//Binary Search Function
		int pos=binaryWordSearch(stringArray,word);
		//int pos=Arrays.binarySearch(stringArray, word);
		if(pos==-1)
			System.out.println("Not present");
		else
			System.out.println("Word present in the "+(pos+1)+" position");
			
		
	}

	//Binary Search Function
	private static int binaryWordSearch(String[] stringArray, String word) 
	{
		int low=0,hi=stringArray.length;
		while(low<hi)
		{
			int mid=(low+hi)/2;
			if(word.compareTo(stringArray[mid])==0)
				return mid;
			else if(word.compareTo(stringArray[mid])>0)
				low=mid+1;
			else
				hi=mid-1;
		}
		return -1;
	}

	//Sorting the String Array without using Inbuilt Function
	private static void sortInOrder(String[] stringArray) 
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
}
