package com.bridgelabz.DataStructures;

public class StackBalancedParenthese <T>
{
	static int siz=0;
	public StackBalancedParenthese(int len)
	{
		this.siz=len;
	}                                          
	
	Node<T> top;
	
	//push method is used to Add the node into the List
	public void push(T data)
	{
		Node<T> n = new Node<T>(data);
		if(top==null)
		{
			top=n;
			return;
		}
		n.next=top;
		top=n;
	}
	
	//pop method is used to delete the node from the List
	public T pop()
	{
		if(top==null)
		{
			System.out.println("Stack underfow..");
			return null;
		}
		T data=top.data;
		top=top.next;
		return data;
		
	}
	
	//peek method is used to return the top most node
	public T peek()
	{
		return top.data;
	}
	
	//isEmpty method is used to check whether the list is Empty or not
	public boolean isEmpty()
	{
		return top==null;
	}
	
	//returns the size of the list
	public int size()
	{
		return siz;
	}
	
	/*//toString method is used to return the element present inside the List
	public String toString()
	{
		return 
	}*/
}
