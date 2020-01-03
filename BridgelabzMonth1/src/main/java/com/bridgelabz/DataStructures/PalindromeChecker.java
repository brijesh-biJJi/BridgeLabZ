package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class PalindromeChecker 
{
	//To check whether the String is Palindrome or not
	public static boolean isPalindrome(String str) 
	{
		QueueUsingLinkedList<Character> qll=new QueueUsingLinkedList<>();
		for (int i = 0; i < str.length(); i++) 
			qll.enQueue(str.charAt(i));
		
		int len=str.length()-1;
		while(!qll.isEmpty())
		{
			if(qll.deQueue()!=str.charAt(len))
				return false;
			len--;
		}
		return true;
	}


	public static void main(String[] args)
	{
		PalindromeChecker pc=new PalindromeChecker();
		System.out.println("Enter the String..");
		String str=InputScanner.inputWord();
		boolean rs=isPalindrome(str);
		if(rs)
			System.out.println("String is Palindrome..");
		else
			System.out.println("String is not a Palindrome...");
	}
}
