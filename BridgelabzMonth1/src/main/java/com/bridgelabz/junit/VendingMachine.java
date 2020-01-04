package com.bridgelabz.junit;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//import java.util.*;
//import java.util.Map.Entry;

import com.bridgelabz.inputscanner.InputScanner;
//import com.bridgelabz.utility.Utility;

//Class to Count the notes in Vending Machine
public class VendingMachine 
{
	//Method to calculate change
	public static Map<Integer, Integer> calculateChange(int amt) 
	{
		Map<Integer,Integer> hmap=new HashMap<>();
		int notes=0,totalNotes=0,div=1000;
		while(amt>0)
		{
			notes=amt/div;
			amt %=div;
			totalNotes +=notes;
			if(notes>0){
				//System.out.println(div+" Rupees Notes are : "+notes);
				hmap.put(div, notes);
			}
			
			if(div==500 || div==50)
				div /=5;
			else
				div /=2;
		}
		return hmap;
	}
	
	
	//static HashMap<Integer,Integer> hmap=new HashMap<>();
	public static void main(String[] args) 
	{
		
		
		System.out.println("Enter the amount...");
		int amt=InputScanner.inputInteger();
		//System.out.println("\nTotal no of Notes are:"+calculateChange(amt));
		
		Map<Integer,Integer> hmap=calculateChange(amt);
		System.out.println("Total number of change : ");
		for (Entry<Integer,Integer> entry : hmap.entrySet())
		{
			Integer key=entry.getKey();
			Integer val=entry.getValue();
			System.out.println(key+" : "+val);
		}
		
		
		/*int[] arAmount=Utility.getIntegerArray(8);		
		HashMap<Integer, Integer> hmap=countNote(amt,arAmount);
		
		System.out.println("Total number of change : ");
		for (Entry<Integer,Integer> entry : hmap.entrySet())
		{
			Integer key=entry.getKey();
			Integer val=entry.getValue();
			System.out.println(key+" : "+val);
		}*/
		
	}
	
  
	/*private static HashMap<Integer, Integer> countNote(int amt, int[] arAmount) 
	{
		
		for(int i=0;i<arAmount.length;i++)
		{
			for (int j = i; j <= i; ) 
			{
				if(arAmount[j]<=amt)
				{
					if(hmap.containsKey(arAmount[j]))
					{
						int c=hmap.get(arAmount[j]);
						hmap.put(arAmount[j],c+1);
					}
					else
						hmap.put(arAmount[j],1);
					
					amt=amt-arAmount[j];
					
				}
				else{
					break;
				}
			}
		}
		return hmap;
	}*/

}
