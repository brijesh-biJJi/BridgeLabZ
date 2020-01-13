package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.JsonInventoryDataManagementImpl;
import com.bridgelabz.inputscanner.InputScanner;

public class JsonInventoryDataFactory
{
static JsonInventoryDataFactory Inventory=new JsonInventoryDataFactory();
JsonInventoryDataManagementImpl inventoryImpl=new JsonInventoryDataManagementImpl();
	public static void main(String[] args)
	{
		String e=new String();
		do
		{
			System.out.println();
			System.out.println("Enter your choice..");
			System.out.println("1. Read Inventory Items\n2. Write the Inventory Data into File..\n3.Read Inventory Object ");
			
			int ch=InputScanner.inputInteger();
			Inventory.menu(ch);
			System.out.println("Press e to Exit or Press any key to Continue..");
			e=InputScanner.inputWord();
		}while(!e.equals("e"));
		System.out.println("Thank You..");
	}
	
	//Menu Method
	public void menu(int ch)
	{
		switch(ch)
		{
			case 1: inventoryImpl.readInventoryItems();
			break;
			
			case 2: inventoryImpl.writeInventoryItems();
			break;
			
			case 3: inventoryImpl.readInventoryObject();
			break;
			
			default: System.out.println("Invalid Choice..");
			break;
		}
	}

}
