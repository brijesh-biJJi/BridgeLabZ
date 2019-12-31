package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;

import com.bridgelabz.DataStructures.LinkedListUtility.Node;
import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class UnOrderedList 
{
	//Creating Object of Linked List Utility Class
	static LinkedListUtility lu=new LinkedListUtility();
	
	static String fileData,wordList[];
	BufferedReader br;
	
	//Collecting the data from the file data1.txt
	public UnOrderedList()
	{
		BufferedReader br=Utility.getBufferReaderObject();
		StringBuilder sb=new  StringBuilder();
		try 
		{
			String str=br.readLine();
			while(str!=null)
			{
				//Appending the data
				sb.append(str);
				str=br.readLine();
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error in reading the file...");;
		}
		finally{
			try {
				br.close();
			} catch (IOException e) 
			{
				System.out.println(e);;
			}
		}
		fileData=sb.toString();
		
		if(fileData!=null)
			wordList=fileData.split(" ");
		else
			System.out.println("Error while reading file...");
	}
	
	
	//Main method of UnOrderedList
	public static void main(String[] args) 
	{
		
		
		//Creating Object of UnOrdered List Class
		UnOrderedList ul=new UnOrderedList();
		
		
		for (int i = 0; i < wordList.length; i++) 
		{
			//Adding the all Words into the Linked List
			lu.addWordsInLinkedList(wordList[i]);
		}
		
		//Printing the Elements of Linked List
		lu.displayLinkedList();
		
		String e=new String();
		do
		{
			System.out.println("\nEnter Your Choice...");
			System.out.println("1. Enter the Word from the List to Search...");
			System.out.println("2. Save the list into the File..");
			int choice=InputScanner.inputInteger();
			ul.menu(choice);
			System.out.println("Press e to exit..");
			e=InputScanner.inputWord();
		}while(!e.equals("e"));
		System.out.println("Thank You...");
		
	}
	public void menu(int choice)
	{
		switch(choice)
		{
		 	case 1: String word;
					System.out.println("Enter the word to search..");
					word=InputScanner.inputWord();
					
					//Calling findWord Method to find the word in the List
					int rs=lu.findWord(word);
					if(rs==-1)
					{
						System.out.println("Word "+word+" is not present in the List...Added that word to the list");
						
						//Adding the Word into the Linked List
						lu.addWordsInLinkedList(word);
						
						//Printing the Elements of Linked List
						lu.displayLinkedList();
					}
					else
					{
						System.out.println("Word "+word+" is present in the List...Removed that word from the list");
						
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
