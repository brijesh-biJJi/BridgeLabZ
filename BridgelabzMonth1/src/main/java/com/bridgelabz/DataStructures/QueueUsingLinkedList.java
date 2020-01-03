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
	Node rear,front;
	
	
	//enQueue method is used to add Node to list 
	public void enQueue(Object data)
	{
		Node n=new Node(data);
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
	/*public Object deQueue()
	{
		if(front==null)
		{
			System.out.println("List is empty..");
			return null;
		}
	
		Object data=t.data;
		return null;
	}*/
}
