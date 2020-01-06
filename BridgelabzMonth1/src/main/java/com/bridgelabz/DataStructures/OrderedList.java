package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class OrderedList
{
		//Creating Object of Linked List Utility Class
		static LinkedListUtility lu=new LinkedListUtility();
		
		//Main method of UnOrderedList
		public static void main(String[] args) 
		{
			//Creating the Object of OrderedList
			OrderedList ol=new OrderedList();
			String fileData;
			
			fileData=lu.getWordFromTheList();
			String wordList[] = null;
					
			if(fileData!=null)
			{
				wordList=fileData.split(" ");
			}
			else
				System.out.println("Error while reading file...");
			
			
			
			
			for (int i = 0; i < wordList.length; i++) 
			{
				//Adding the all Words into the Linked List
				lu.addWordsIntoListInAscendingOrder(wordList[i]);
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
				//ol.menu(choice);
				
				System.out.println("\nPress e to Exit..Or Press ant key to continue...");
				
				e=InputScanner.inputWord();
			}while(!e.equals("e"));
			System.out.println("Thank You...");
			
		}
}
