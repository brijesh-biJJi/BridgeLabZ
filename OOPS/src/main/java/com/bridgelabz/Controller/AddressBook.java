package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.AddressBookImpl;
import com.bridgelabz.inputscanner.InputScanner;

public class AddressBook 
{
	static AddressBook addBook=new AddressBook();
	
	AddressBookImpl addBookImpl=new AddressBookImpl();
	public static void main(String[] args) 
	{

		String e=new String();
		do
		{
			System.out.println();
			System.out.println("Enter your choice..");
			System.out.println("1. Add Person details to Address Book\n2. Edit Person details in Address Book\n3. Delete the Person From Address Book\n4. Display AddressBook");
			
			int ch=InputScanner.inputInteger();
			addBook.menu(ch);
			System.out.println("Press e to Exit or Press any key to Continue..");
			e=InputScanner.inputWord();
		}while(!e.equals("e"));
		System.out.println("Thank You..");
	}
	public void menu(int ch) 
	{
		switch(ch)
		{
			case 1: addBookImpl.addAddressBook();
			break;
			
			case 2: 
					System.out.println("Enter the Person Object to Edit..");
					String personObj=InputScanner.inputWord();
					addBookImpl.editAddressBook(personObj);
			break;
			
			case 3: 
					System.out.println("Enter the Person Object to Delete..");
					String personObj1=InputScanner.inputWord();
					addBookImpl.deleteAddressBook(personObj1);
			break;
			
			case 4:
					addBookImpl.displayAddressBook();
					break;
			
			default: System.out.println("Invalid Choice..");
			break;
		}
	}

}
