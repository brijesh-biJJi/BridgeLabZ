package com.bridgelabz.DataStructures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.bridgelabz.DataStructures.LinkedListUtility.Node;

//LinkedList Utility class contains the Utility methods which can be made use in UnOrderedList class
public class LinkedListUtility 
{
	
	//Class Node is used to create a Node
	class Node<String>
	{
		
		Object data;
		Node<String> next;
		public Node(Object data)
		{
			this.data=data;
		}
	}
	Node<String> head;
	
	//addWordsInLinkedList method is used to add Nodes into the Linked List
	public void addWordsInLinkedList(String data)
	{
			Node<String> n=new Node<String>(data);
			if(head==null)
			{
				head=n;
				return;
			}
			Node<String> temp;
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
		Node<String> t=head;
		while(in>1)
		{
			t=t.next;
			in--;
		}
		t.next=t.next.next;
	}


	//findWord method is used to find te word present in the List
	public int findWord(String word)
	{
		int c=0;
		Node<String> temp=head;
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
		Node temp;
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
		Node temp;
		temp=head;
		while(temp!=null)
		{
			str=str+temp.data+" ";
			temp=temp.next;
		}
		return str;
	}
	
	
	
	//Stack Using Linked List
	//Addlast method to add element in the last
	public void addLast(Object data)
	{
		Node<String> n= new Node<String>(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node<String> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	
	public Object deleteLast()
	{
		Node<String> t=head,t1=head;
		while(t.next!=null)
		{
			t1=t;
			t=t.next;
		}
		Object data=t.data;
		t1.next=null;
		return data;
	}
	
	public String toString()
	{
		String str="";
		Node temp;
		temp=head;
		while(temp!=null)
		{
			str=str+temp.data+" ";
			temp=temp.next;
		}
		return str;
	}
}
