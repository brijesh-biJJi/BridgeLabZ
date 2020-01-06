package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class UnOrderedList 
{
	//Creating Object of Linked List Utility Class
	static LinkedListUtility lu=new LinkedListUtility();
	
	//Main method of UnOrderedList
	public static void main(String[] args) 
	{
		
		String fileData;
		
		fileData=lu.getWordFromTheList();
		String wordList[] = null;
				
		if(fileData!=null)
		{
			wordList=fileData.split(" ");
		}
		else
			System.out.println("Error while reading file...");
		//Creating Object of UnOrdered List Class
		UnOrderedList ul=new UnOrderedList();
		
		
		for (int i = 0; i < wordList.length; i++) 
		{
			//Adding the all Words into the Linked List
			lu.addWordsInLinkedList(wordList[i]);
		}
		
		
		String e=new String();
		do
		{
			//Printing the Elements of Linked List
			lu.displayLinkedList();
			System.out.println();
			System.out.println("\nEnter Your Choice...");
			System.out.println("1. Enter the Value from the List to Search...");
			System.out.println("2. Write the list into the File..");
			int choice=InputScanner.inputInteger();
			ul.menu(choice);
			
			System.out.println("\nPress e to Exit..Or Press ant key to continue...");
			
			e=InputScanner.inputWord();
		}while(!e.equals("e"));
		System.out.println("Thank You...");
		
	}
	public void menu(int choice)
	{
		switch(choice)
		{
		 	case 1: String word;
					System.out.println("Enter the Value to search..");
					word=InputScanner.inputWord();
					
					//Calling findWord Method to find the word in the List
					int rs=lu.findWord(word);
					if(rs==-1)
					{
						System.out.println("Value "+word+" is not present in the List...Added that Value to the end of the List");
						System.out.println();
						
						//Adding the Word into the Linked List
						lu.addWordsInLinkedList(word);
						
						//Printing the Elements of Linked List
						lu.displayLinkedList();
					}
					else
					{
						System.out.println("Value "+word+" is present in the List...Removed that Value from the list");
						System.out.println();
						
						//Deleting the word from the Linked List
						lu.removeWordFromList(rs-1);
						
						//Printing the Elements of Linked List
						lu.displayLinkedList();
					}
					
					break;
		 	case 2 :
		 			//calling saveToFile method to save the data into the file
		 			lu.saveToFile();
		 			System.out.println("Data's are saved to WordList file..");
		 			break;
		}
	}
	
}
