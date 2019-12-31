package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;

import com.bridgelabz.DataStructures.LinkedListUtility.Node;
import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class UnOrderedList 
{
static String fileData,wordList[];
BufferedReader br;
	
	
	public UnOrderedList()
	{
		/*fileData=Utility.getFileData("D:\\GitBridgelabz\\bridgelabzLocal.data1.txt");
		if(fileData!=null)
			wordList=fileData.split(" ");
		else
			System.out.println("Error while reading file...");*/
		BufferedReader br=Utility.getBufferReaderObject();
		StringBuilder sb=new  StringBuilder();
		try 
		{
			String str=br.readLine();
			while(str!=null)
			{
				sb.append(str);
				str=br.readLine();
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
		fileData=sb.toString();
		if(fileData!=null)
			wordList=fileData.split(" ");
		else
			System.out.println("Error while reading file...");
	}
	
	
	//Main method of UnOrderedList
	public static void main(String[] args) 
	{
		//Creating Object of Linked List Utility Class
		LinkedListUtility lu=new LinkedListUtility();
		
		//Creating Object of UnOrdered List Class
		UnOrderedList ul=new UnOrderedList();
		for (int i = 0; i < wordList.length; i++) 
		{
			lu.addWordsInLinkedList(wordList[i]);
		}
		
		//Printing the Elements of Linked List
		lu.displayLinkedList();
		
		String word;
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
	}
}
