package com.bridgelabz.DataStructures;

import java.util.ArrayList;

import com.bridgelabz.inputscanner.InputScanner;

public class Hashing 
{
	ArrayList<OrderedList> mList;

	public Hashing(){
		mList=new ArrayList<OrderedList>();
	}

	
	public static void main(String args[]){
		Hashing Hashing=new Hashing();
		Hashing.putElementsInTheList();
		OrderedList OrderedList;
		LinkedListUtility lu= new LinkedListUtility();
		System.out.println("Size is :"+Hashing.mList.size());
		while(true){
			System.out.println("Enter number to search");
			int number=InputScanner.inputInteger();
			int reminder=number%11;
			try{
				OrderedList=Hashing.mList.get(reminder);
				//int found=lu.findWord(new Integer(number));
				int found=lu.findWord1(number);
				System.out.println(found);

				if(found==-1){
					lu.addWordsIntoListInAscendingOrder(number);
					System.out.println("Number is add to the List at hasing reminder is "+reminder);
				}
				else{
					try{
						lu.removeWordFromList(number-1);
						System.out.println(number+" is deleted.");
					}
					catch(Exception exception){
						//System.out.println("Error in deleting "+number);
					}	
				}
			}
			catch(Exception exception){
				System.out.println(exception);
			}
			Hashing.printTheHashMap();
			System.out.println();
		}
	}

	public  void putElementsInTheList(){
		for(int i=0;i<11;i++)
			mList.add(new OrderedList<Integer>());
	}

	public  void printTheHashMap(){
		for(int i=0;i<11;i++){
			System.out.print(i+" --> ");
			mList.get(i).lu.displayLinkedList();
		}
	}
}
