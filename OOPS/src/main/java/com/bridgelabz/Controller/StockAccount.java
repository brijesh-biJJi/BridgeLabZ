package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.StockAccountImplementation;
import com.bridgelabz.inputscanner.InputScanner;

public class StockAccount 
{

	static StockAccountImplementation stockImpl=new StockAccountImplementation();
	static StockAccount stockAcc=new StockAccount();
	
	public static void main(String[] args) 
	{
		String e=new String();
		do
		{
			System.out.println();
			System.out.println("Enter your choice..");
			System.out.println("1. Add Shares of Stock to Account\n2. Subtract Shares of Stock from Account\n3. Save Account to File\n4. Print a detailed report of Stocks and Values");
			
			int ch=InputScanner.inputInteger();
			stockAcc.menu(ch);
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
			case 1: stockImpl.buy(amount, symbol);
			break;
			
			case 2: stockImpl.sell(amount, symbol);
			break;
			
			case 3: stockImpl.save(fileName);
			break;
			
			case 4: stockImpl.printReport();
			break;
			
			default: System.out.println("Invalid Choice..");
			break;
		}
	}

}
