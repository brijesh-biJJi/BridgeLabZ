package com.bridgelabz.ServiceImplementation;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.json.simple.JSONObject;

import com.bridgelabz.Model.StockAccountManagementModel;
import com.bridgelabz.Services.IStockAccount;
import com.bridgelabz.inputscanner.InputScanner;

/**
 * implementation class
 * @author user
 *
 */
public class StockAccountImpl implements IStockAccount
{
	
	StockAccountManagementModel  stockModel=new StockAccountManagementModel();
	public StockAccountImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Create a new Account from File
	 */
	
	public void stockAccountImpl()
	{
		JSONObject root=new JSONObject();
		System.out.println("Enter the Account name..");
		String newAcc=InputScanner.inputWord();
		
		JSONObject stockObj=new JSONObject();
		
		System.out.println("Enter the Stock_Name..");
		String stock_name=InputScanner.inputWord();
		stockModel.setStock_name(stock_name);
		stockObj.put("stock_name", stockModel.getStock_name());
		
		System.out.println("Enter the Number_Of_Shares");
		long number_of_shares=InputScanner.inputlong();
		stockModel.setNumber_of_shares(number_of_shares);
		stockObj.put("number_of_shares", stockModel.getNumber_of_shares());
		
		System.out.println("Enter the Share_Price");
		long share_price=InputScanner.inputlong();
		stockModel.setShare_price(share_price);
		stockObj.put("share_price", stockModel.getShare_price());
		
		
		root.put(newAcc, stockObj);
		
		 try{
			  FileWriter fstream = new FileWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stockOutput.json",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(root.toJSONString()+"\n");
			  out.close();
		  }catch (Exception e){
			 System.err.println("Error while writing to file: " +
		          e.getMessage());
		  }
		
		
		System.out.println("\nStock Account Data's Stored into the File...");
	}
	
	/**
	 * Total value of Account
	 */
	@Override
	public double valueOF() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Add Shares of Stock to Account
	 */
	@Override
	public void buy(int amount, String symbol) 
	{
		// TODO Auto-generated method stub
		
	}

	/**
	 * Subtract Shares of Stock from Account
	 */
	@Override
	public void sell(int amount, String symbol)
	{
		// TODO Auto-generated method stub
		
	}

	/**
	 * Save Account to File
	 */
	@Override
	public void save(String fileName) 
	{
		// TODO Auto-generated method stub
		
	}

	/**
	 * Print a detailed report of Stocks and Values
	 */
	@Override
	public void printReport() 
	{
		// TODO Auto-generated method stub
		
	}

}
