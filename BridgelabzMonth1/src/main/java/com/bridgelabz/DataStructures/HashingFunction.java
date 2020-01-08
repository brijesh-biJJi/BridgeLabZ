package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class HashingFunction
{
	//Creating Object of Linked List Utility Class
	static LinkedListUtility<Integer> lu=new LinkedListUtility<>();
	
	//Creating Object of Node Class
	static Node[] ht=new Node[11];
	
	//Creating the Object Of HashingFunction
	static HashingFunction hf=new HashingFunction();

	//Main method of HashingFunction Class
	public static void main(String[] args) 
	{
		String fileData;
		
		//get the data from the File
		fileData=lu.getWordFromTheList();
		String wordList[] = null;
			
		//Storing the data to the wordList by using split function
		if(fileData!=null)
		{
			wordList=fileData.split(" ");
		}
		else
			System.out.println("Error while reading file...");
		
		//Adding all the data into the Linked List as Node
		for (int i = 0; i < wordList.length; i++) 
		{
			int in=lu.getIndex(Integer.parseInt(wordList[i]));
			//Adding the all Words into the Linked List
			ht[in]=lu.addValueInOrder(ht[in],Integer.parseInt(wordList[i]));
		}
		
		
		String e=new String();
		
		//DoLoop is used to selecting the choice
		do
		{
			System.out.println();
			System.out.println("\nEnter Your Choice...");
			System.out.println("1. Enter the Value from the List to Search...");
			System.out.println("2. Write the list into the File..");
			int choice=InputScanner.inputInteger();
			hf.menu(choice);
				
			System.out.println("\nPress e to Exit..Or Press ant key to continue...");
			
			e=InputScanner.inputWord();
		}while(!e.equals("e"));
		System.out.println("Thank You...");
		
		System.out.println("Enter the number to Search..");
		int num=InputScanner.inputInteger();
		
		//To find the index of the Number
	//int in=lu.getIndex(num);
	/*		boolean rs=lu.findValue(ht[in],num);
		System.out.println(rs);
		if(!rs)
		{
			ht[in]=lu.addValueInOrder(ht[in],num);
		}*/
		
		
		for (int i = 0; i < ht.length; i++)
		{
			System.out.print(i+"->");
			lu.printHashTableValue(ht[i]);
			System.out.println();
			System.out.println();
		}
	}

}
