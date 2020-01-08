package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class OrderedList<T>
{
		//Creating Object of Linked List Utility Class
		static LinkedListUtility lu=new LinkedListUtility();
		
		//Main method of UnOrderedList
		public static void main(String[] args) 
		{
			//Creating the Object of OrderedList
			OrderedList ol=new OrderedList();
			String fileData;
			
			//get the data frm the File
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
				//Adding the all Words into the Linked List
				lu.addWordsIntoListInAscendingOrder(Integer.parseInt(wordList[i]));
				
			}
			
				
			String e=new String();
			
			//DoLoop is used to selecting the choice
			do
			{
				//Printing the Elements of Linked List
				lu.displayLinkedList();
				System.out.println();
				System.out.println("\nEnter Your Choice...");
				System.out.println("1. Enter the Value from the List to Search...");
				System.out.println("2. Write the list into the File..");
				int choice=InputScanner.inputInteger();
				ol.menu(choice);
					
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
						
						//Calling findWord Method to find the word in the List
						int rs=lu.findWord1(value);
						if(rs==-1)
						{
							System.out.println("Value "+value+" is not present in the List...Added that Value to the List");
							System.out.println();
							
							//Adding the Word into the Linked List
							lu.addWordsIntoListInAscendingOrder(value);
							
							//Printing the Elements of Linked List
							lu.displayLinkedList();
						}
						else
						{
							System.out.println("Value "+value+" is present in the List...Removed that Value from the list");
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
			 			
			 	default :
			 		System.out.println("Invalid Choice...!");
			 		break;
			}
		}
}
