package com.bridgelabz.Controller;

import com.bridgelabz.ServiceImplementation.StockAccountImpl;
import com.bridgelabz.inputscanner.InputScanner;

/**
 * Stock Account 
 * @author user
 *
 */
public class StockAccount 
{

	static StockAccountImpl stockImpl=new StockAccountImpl();
	static StockAccount stockAcc=new StockAccount();
	
	public static void main(String[] args) 
	{
		String e=new String();
		do
		{
			System.out.println();
			System.out.println("Enter your choice..");
			System.out.println("1. Create a new Account from File\n2. Add Shares of Stock to Account\n3. Subtract Shares of Stock from Account\n4. Save Account to File\n5. Print a detailed report of Stocks and Values");
			
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
			case 1:stockImpl.stockAccountImpl();
			break;
			
			case 2:
					System.out.println("Enter the number of share to Buy");
					long share=InputScanner.inputlong();
					System.out.println("Enter the Stock name");
					String stockName=InputScanner.inputWord();
					stockImpl.buy(share, stockName);
			break;
			
			/*case 3: stockImpl.sell(amount, symbol);
			break;
			
			case 4: stockImpl.save(fileName);
			break;
			
			case 5: stockImpl.printReport();
			break;*/
			
			
			default: System.out.println("Invalid Choice..");
			break;
		}
	}

}
