package com.bridgelabz.DataStructures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bridgelabz.DataStructures.Node;

//LinkedList Utility class contains the Utility methods which can be made use in UnOrderedList class
public class LinkedListUtility <T>
{
	Node<T> head;
	
	//addWordsInLinkedList method is used to add Nodes into the Linked List
	public void addWordsInLinkedList(T data)
	{
			Node<T> n=new Node<>(data);
			if(head==null)
			{
				head=n;
				return;
			}
			Node<T> temp;
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			return;
	}
	
	
	//removeWordFromList method is used to Remove Word From the Linked List
	public void removeWordFromList(int in) 
	{
		Node<T> t=head;
		if(in==0)
		{
			head=head.next;
		}
		while(in>1)
		{
			t=t.next;
			in--;
		}
		t.next=t.next.next;
	}


	//findWord method is used to find the word present in the List
	public int findWord(T word)
	{
		int c=0;
		Node<T> temp=head;
		while(temp!=null)
		{
			c++;
			if(temp.data.equals(word))
				return c;
			temp=temp.next;
		}
		return -1;
	}	
	
		
	//displayLinkedList is used to Display the Element present in the List	
	public void displayLinkedList()
	{
		Node<T> temp;
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			if(temp.next!=null)
				System.out.print("->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	////saveToFile is used to save the data into the file
	public void saveToFile()
	{
		String data=getData();
		//File file=new File("wordList.txt");
		try 
		{
			FileOutputStream fs=new FileOutputStream("wordList.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fs);
			oos.writeObject(data);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

    //getData method is used to get the data from the List
	public String getData() 
	{
		String str="";
		Node<T> temp;
		temp=head;
		while(temp!=null)
		{
			str=str+temp.data+" ";
			temp=temp.next;
		}
		return str;
	}
}
