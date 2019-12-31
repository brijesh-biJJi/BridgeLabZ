package com.bridgelabz.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class BinarySearchGenerics<T> implements Comparable<T>
{
	public  T[] insertionSort(T[] strArray)
	{
		for(int i=1;i<strArray.length;i++)
		{
			T ele=strArray[i];
			int j=i-1;
			/*while(j>=0 && ((ele).compareTo( strArray[j])<0))
			{
				strArray[j+1]=strArray[j];
				j--;
			}*/
			strArray[j+1]=ele;
		}
		return strArray;
		
	}
	public static void main(String[] args)
	{
		
		//insertionSort(new Integer[]{5,4,3,2,1});
		
		BinarySearchGenerics<Integer> b= new BinarySearchGenerics<>();
		/*Integer[] values={5,4,3,2,1};
		Integer[] res=b.insertionSort(values);
		String[] values={"e","d","c","b"};
		String[] res=b.insertionSort(values);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
		
		
		
		
		
		
		
		/*BufferedReader br=Utility.getBufferReaderObject();
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
		Arrays.sort(stringArray);
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]+" ");
		}
		System.out.println();
		
		System.out.println("\nEnter the word to search..!");
		String word=InputScanner.inputWord();
		int pos=Arrays.binarySearch(stringArray, word);
		if(pos==-1)
			System.out.println("Not present");
		else
			System.out.println("Word present in the "+(pos+1)+" position");*/
		
		
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
