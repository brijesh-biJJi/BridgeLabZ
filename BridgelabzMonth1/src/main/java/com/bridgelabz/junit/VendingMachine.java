package com.bridgelabz.junit;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import com.bridgelabz.inputscanner.InputScanner;


//Class to Count the notes in Vending Machine
public class VendingMachine 
{
	//Method to calculate change
	public static Map<Integer, Integer> calculateChange(int amt) 
	{
		Map<Integer,Integer> hmap=new HashMap<>();
		int notes=0;
		int div=1000;
		while(amt>0)
		{
			notes=amt/div;
			amt %=div;
			if(notes>0){
				hmap.put(div, notes);
			}
			
			if(div==500 || div==50)
				div /=5;
			else
				div /=2;
		}
		return hmap;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the amount...");
		int amt=InputScanner.inputInteger();
		
		Map<Integer,Integer> hmap=calculateChange(amt);
		System.out.println("Total number of change : ");
		for (Entry<Integer,Integer> entry : hmap.entrySet())
		{
			Integer key=entry.getKey();
			Integer val=entry.getValue();
			System.out.println(key+" : "+val);
		}
	}
}
