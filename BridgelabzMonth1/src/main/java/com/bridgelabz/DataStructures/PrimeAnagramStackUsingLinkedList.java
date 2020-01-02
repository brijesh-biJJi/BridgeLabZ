package com.bridgelabz.DataStructures;

public class PrimeAnagramStackUsingLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedListUtility llu=new LinkedListUtility();
		llu.addLast("abc");
		llu.addLast("def");
		llu.addLast("ghi");
		System.out.println(llu);
		System.out.println(llu.deleteLast());
		System.out.println(llu);
	}

}
