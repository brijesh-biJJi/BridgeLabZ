package com.bridgelabz.DataStructures;

import com.bridgelabz.DataStructures.LinkedListUtility.Node;

public class LinkedListUtility 
{
	
	class Node<String>
	{
		
		Object data;
		Node<String> next;
		public Node(Object data)
		{
			this.data=data;
		}
	}
	static Node<String> head;
	
	
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
	
	
	//Remove Word From the List
		public void removeWordFromList(int in) 
		{
			Node<String> t=LinkedListUtility.head;
			while(in>1)
			{
				t=t.next;
				in--;
			}
			t.next=t.next.next;
		}



		public int findWord(String word)
		{
			int c=0;
			Node<String> temp=LinkedListUtility.head;
			while(temp!=null)
			{
				c++;
				if(temp.data.equals(word))
					return c;
				temp=temp.next;
			}
			return -1;
		}	
	
	public void displayLinkedList()
	{
		Node temp;
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
