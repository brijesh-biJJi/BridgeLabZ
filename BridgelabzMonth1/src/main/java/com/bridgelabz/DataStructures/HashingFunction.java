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
			for (int i = 0; i < ht.length; i++)
			{
				System.out.print(i+"->");
				
				//calling displayValueOfHashTable method is to Print the Value and Save the data into the file
				lu.printHashTableValue(ht[i]);
				
				System.out.println();
				System.out.println();
			}
			System.out.println();
			System.out.println("\nEnter Your Choice...");
			System.out.println("1. Enter the Value to Search from the List...");
			System.out.println("2. Display the list and Save it into the File..");
			int choice=InputScanner.inputInteger();
			hf.menu(choice);
				
			System.out.println("\nPress e to Exit..Or Press ant key to continue...");
			
			e=InputScanner.inputWord();
		}while(!e.equals("e"));
		System.out.println("Thank You...");
	}
	
		//Menu method
		public void menu(int choice)
		{
			switch(choice)
			{
			 	case 1: int value;
						System.out.println("Enter the Value to search..");
						value=InputScanner.inputInteger();
						
						//To find the index of the Number
						int in=lu.getIndex(value);
						
						//Calling findWord Method to find the value in the List
						boolean rs=lu.findValue(ht[in],value);
						if(!rs)
						{
							System.out.println("Value "+value+" is not present in the HashTable...Added that Value to the List");
							System.out.println();
							
							//Adding the Value into the Linked List
							ht[in]=lu.addValueInOrder(ht[in],value);
						}

						else
						{
							System.out.println("Value "+value+" is present in the HashTable...Removed that Value from the list");
							System.out.println();
							
							//Deleting the Value from the HashTable
							ht[in]=lu.deleteValueFromHashTable(ht[in],value);
						}
							
						break;
			 	case 2 :
				 		for (int i = 0; i < ht.length; i++)
						{
							System.out.print(i+" => ");
							
							//calling displayValueOfHashTable method is to Print the Value and Save the data into the file
							lu.printHashTableValue(ht[i]);
							
							System.out.println();
							System.out.println();
						}
				 		System.out.println("Data's are saved to WordList file..");
						break;
				 			
			 	default :
			 			System.out.println("Invalid Choice...!");
				 		break;
				}
			}

}
