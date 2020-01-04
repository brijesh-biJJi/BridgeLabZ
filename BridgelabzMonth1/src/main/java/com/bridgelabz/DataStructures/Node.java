package com.bridgelabz.DataStructures;

//Class Node is used to create a Node
public class Node<T>
{
	T data;
	Node<T> next;
	
	//Used to initialize the Data
	public Node(T data)
	{
		this.data=data;
	}
}
