package com.bridgelabz.DataStructures;

import com.bridgelabz.inputscanner.InputScanner;

public class QueueImplementedUsingLinkedList <T>
{
	LinkedList<T> queue = new LinkedList<T>();
	int index = 0;
	public int bankBalance = 5000;
	int counter = 1;

	
	//Purpose: method for getting the size of queue
	public int size() 
	{
		return index;
	}

	//Purpose: method for enqueue the element
	public void enQueue(T data) 
	{
		queue.add(data);
		index++;
	}

	

	
	//Purpose: method for dequeue the element

	public void deQueue() {
		index--;
		queue.deleteAt(index);
	}

	
	//Purpose: checking wether queue is empty or not
	public boolean isEmpty() 
	{
		return queue.isEmpty();
	}

	

	/**
	 * Purpose: method for serving people who are in queue
	 */
	public void service() {

		System.out.println("Token number is : " + counter);

		int choice;
		int amount = 0;
		System.out.println("press 1: for withdraw\npress 2: for deposit");
		choice = InputScanner.inputInteger();

		switch (choice) {
		case 1:
			System.out.println("Enter amount to withdraw");
			amount =InputScanner.inputInteger();
			if((bankBalance - amount)<0)
			{
				System.out.println("Insufficient Balance..");
				return;
			}
			bankBalance = bankBalance - amount;
			System.out.println("Thank you for using service");
			amount = 0;
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			amount = InputScanner.inputInteger();
			bankBalance = bankBalance + amount;
			System.out.println("Thank you for using service");
			amount = 0;
			break;
		default:
			System.out.println("Enter valid option");
		}
		counter++;

	}

}
