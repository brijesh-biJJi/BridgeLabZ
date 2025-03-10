package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.StockAccountManagementImpl;
import com.bridgelabz.inputscanner.InputScanner;

/**
 * StockAccountManagement class
 * @author user
 *
 */
public class StockAccountManagement
{
	StockAccountManagementImpl stockImpl=new StockAccountManagementImpl();
	static StockAccountManagement stockObj=new StockAccountManagement();
	
	/**
	 * main method of StockAccountManagement
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String e=new String();
		do
		{
			System.out.println("Enter your choice...\n1. readStockData\n2. writeStockData");
			int ch=InputScanner.inputInteger();
			stockObj.menu(ch);
			
			System.out.println("Press e to Exit..Or Press any key to Continue..");
			e=InputScanner.inputWord();
			
		}while(!e.equals("e"));
		System.out.println("Thank You...");
	}
	
	/**
	 * Menu method to choose the option
	 * @param ch
	 */
	private void menu(int ch)
	{
		switch(ch)
		{
			case 1: stockImpl.readStockData();
				break;
				
			case 2: stockImpl.writeStockData();
				break;
				
			default :
				System.out.println("Invalid Choice..");
				break;
		}
	}

}
