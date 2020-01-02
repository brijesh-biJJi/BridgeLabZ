package com.bridgelabz.DataStructures;

//Implementing Queue Using Linked List
public class QueueUsingLinkedList 
{
	//Node class is Used to create a Node
	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node head;
	
	
	//enQueue method is used to add Node to list 
	public void enQueue(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	
	//deQueue method is used to delete Node from the list
	public Object deQueue()
	{
		
		return data;
	}
}
