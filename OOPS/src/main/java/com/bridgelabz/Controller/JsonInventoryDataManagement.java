package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.JsonInventoryDataManagementImpl;
import com.bridgelabz.inputscanner.InputScanner;

public class JsonInventoryDataManagement
{
static JsonInventoryDataManagement Inventory=new JsonInventoryDataManagement();
JsonInventoryDataManagementImpl inventoryImpl=new JsonInventoryDataManagementImpl();
	public static void main(String[] args)
	{
		String e=new String();
		do
		{
			System.out.println();
			System.out.println("Enter your choice..");
			System.out.println("1. Add Inventory Items\n2. Save the Inventory Data into File..");
			
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
			case 1: inventoryImpl.addInventoryItems();
			break;
			
			case 2: inventoryImpl.saveInventoryItems();
			break;
			
			default: System.out.println("Invalid Choice..");
			break;
		}
	}

}
