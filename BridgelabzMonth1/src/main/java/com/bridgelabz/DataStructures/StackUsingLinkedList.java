package com.bridgelabz.DataStructures;

import com.bridgelabz.DataStructures.Node;

//Stack Using Linked List
public class StackUsingLinkedList<T>
{
	
		Node<T> top;
	
		//Addlast method to add element in the last
		public void push(T data)
		{
			Node<T> n= new Node(data);
			if(top==null)
			{
				top=n;
				return;
			}
			n.next=top;
			top=n;
		}
		
		//deleteLast method is used to delete the element from the last
		public T pop()
		{
			if(top==null)
			{
				System.out.println("Stack Overflow..");
				return null;
			}
			T data=top.data;
			top=top.next;
			return data;
		}
		
		//toString method is used to return the element present in the list
		public String toString()
		{
			String str="";
			Node<T> temp;
			temp=top;
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
			Node<T> next,prev,cur;
			next=null;
			prev=null;
			cur=top;
			while(cur!=null)
			{
				next=cur.next;
				cur.next=prev;
				prev=cur;
				cur=next;
			}
			top=prev;
		}
		
		//peek() method is used to return the top most element from the list
		public T peek()
		{
			if(top==null)
			{
				System.out.println("Stack Overflow..");
				return null;
			}
			return top.data;
		}
}
