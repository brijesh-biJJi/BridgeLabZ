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
		
		Utility.displayStringArray(stringArray);
		
		//Sorting String Array using Inbuilt Function
		/*Arrays.sort(stringArray);
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]+" ");
		}
		System.out.println();
		*/
		
		
		//Sorting the String Array without using Inbuilt Function
		Utility.sortInOrder(stringArray);
		
		Utility.displayStringArray(stringArray);
		
		System.out.println("\nEnter the word to search..!");
		String word=InputScanner.inputWord();
		
		
		//Binary Search Function
		int pos=Utility.binaryWordSearch(stringArray,word);
		
		//int pos=Arrays.binarySearch(stringArray, word);
		
		if(pos==-1)
			System.out.println("Not present");
		else
			System.out.println("Word present in the "+(pos+1)+" position");
			
		
	}
}
