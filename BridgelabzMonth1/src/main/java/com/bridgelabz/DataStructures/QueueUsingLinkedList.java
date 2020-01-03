package com.bridgelabz.DataStructures;

import com.bridgelabz.DataStructures.StackUsingLinkedList.Node;

//Implementing Queue Using Linked List
public class QueueUsingLinkedList <T>
{
	//Node class is Used to create a Node
	class Node<T>
	{
		T data;
		Node next;
		Node(T data)
		{
			this.data=data;
		}
	}
	Node rear,front;
	
	
	//enQueue method is used to add Node to list 
	public void enQueue(T data)
	{
		Node<T> n=new Node<>(data);
		if(rear==null)
		{
			rear=n;
			front=n;
			return;
		}
		while(rear.next!=null)
		{
			rear=rear.next;
		}
		rear.next=n;
		rear=rear.next;
	}
	
	//deQueue method is used to delete Node from the list
	public T deQueue()
	{
		if(front==null)
		{
			System.out.println("List is empty..");
			return null;
		}
	
		T data=(T) front.data;
		front=front.next;
		if(front==null)
			rear=null;
		return data;
	}
	
	//To check whether list is Empty or not
	public boolean isEmpty()
	{
		return front==null || rear==null;
	}
	
	//toString method is used to return the element present in the list
			public String toString()
			{
				String str="";
				Node temp;
				temp=front;
				while(temp!=null)
				{
					str=str+temp.data;
					if(temp.next!=null)
						str=str+"->";
					temp=temp.next;
				}
				return str;
			}
}
