package com.bridgelabz.DataStructures;

import com.bridgelabz.DataStructures.Node;

//Class Node is used to create a Node
public class Node<T>
{
	T data;
	Node<T> next;
	Node<T> right,left;
	
	//Used to initialize the Data
	public Node(T data)
	{
		this.data=data;
	}
}
