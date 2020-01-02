package com.bridgelabz.DataStructures;

import com.bridgelabz.DataStructures.LinkedListUtility.Node;

//Stack Using Linked List
public class StackUsingLinkedList
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
	
		//Addlast method to add element in the last
		public void push(Object data)
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
		
		//deleteLast method is used to delete the element from the last
		public Object pop()
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
		
		//toString method is used to return the element present in the list
		public String toString()
		{
			String str="";
			Node temp;
			temp=head;
			while(temp!=null)
			{
				str=str+temp.data;
				if(temp.next!=null)
					str=str+"->";
				temp=temp.next;
			}
			return str;
		}
		
		
		//reverse method is used to reverse the Linked List
		public void reverseList()
		{
			Node next,prev,cur;
			next=null;
			prev=null;
			cur=head;
			while(cur!=null)
			{
				next=cur.next;
				cur.next=prev;
				prev=cur;
				cur=next;
			}
			head=prev;
		}
}
