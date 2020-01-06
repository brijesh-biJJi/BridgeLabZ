package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class BankingCashCounter
{
	public static void main(String[] args) 
	{
		QueueImplementedUsingLinkedList<Integer> queue = new QueueImplementedUsingLinkedList<Integer>();
		System.out.println("Enter people size");
		int people = InputScanner.inputInteger();

		System.out.println("Welcome to bank simulation: ");
		for (int i = 0; i < people; i++) 
		{

			queue.enQueue(i);
			queue.service();
			queue.deQueue();
		}
		
		if (queue.isEmpty())
		{
			System.out.println("Queue is empty");
		}
		System.out.println("Bank Closing balance is : " + queue.bankBalance);
	}

}
