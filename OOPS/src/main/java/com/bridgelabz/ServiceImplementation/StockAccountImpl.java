package com.bridgelabz.ServiceImplementation;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
	
	StockAccountManagementModel  stockModel;
	JSONParser jsonParser;
	LocalDateTime now;
	DateTimeFormatter dateTimeFormatter;
	public StockAccountImpl()
	{
		stockModel=new StockAccountManagementModel();
		jsonParser=new JSONParser();
		dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		now = LocalDateTime.now();
		
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
		System.out.println("Date : "+dateTimeFormatter.format(now));
		return 0;
	}

	/**
	 * Add Shares of Stock to Account
	 */
	@Override
	public void buy(long share, String stockAcc) 
	{
		try 
		{
			/**
			 * Reading the data from Json File
			 */

			
			JSONObject rootObject=(JSONObject) jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stock.json"));
			
			JSONObject stockObject=(JSONObject)rootObject.get(stockAcc);
			
			if(stockObject==null) {
				System.out.println("You do not have "+stockAcc+" Shares...");
				return;
			}
			
			long number_of_shares=(long)stockObject.get("number_of_shares");
			long new_share=number_of_shares + share;
			stockModel.setNumber_of_shares(new_share);
			stockObject.put("number_of_shares", stockModel.getNumber_of_shares());
			rootObject.put(stockAcc, stockObject);
			save(rootObject);
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		catch (ParseException e) {e.printStackTrace();}
	}

	/**
	 * Subtract Shares of Stock from Account
	 */
	@Override
	public void sell(long share, String stockAcc)
	{
		try
		{
			JSONObject rootObject=(JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stock.json"));
			JSONObject stockObject=(JSONObject )rootObject.get(stockAcc);
			
			if(stockObject==null) {
				System.out.println("You do not have "+stockAcc+" Shares...");
				return;
			}
			
			long number_of_shares=(long)stockObject.get("number_of_shares");
			if(number_of_shares - share <=0) {
				System.out.println("Your Account Doesn't have these many Shares...\nYou Own "+number_of_shares+" number of Shares..");
				return;
			}
			
			long new_share=number_of_shares - share;
			stockModel.setNumber_of_shares(new_share);
			stockObject.put("number_of_shares", stockModel.getNumber_of_shares());
			rootObject.put(stockAcc, stockObject);
			save(rootObject);
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		catch (ParseException e) {e.printStackTrace();}
	}

	/**
	 * Save Account to File
	 */
	@Override
	public void save(JSONObject rootObject) 
	{
		 try{
			  FileWriter fstream = new FileWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stockOutput.json",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(rootObject.toJSONString()+"\n");
			  out.close();
		  }catch (Exception e){
			 System.err.println("Error while writing to file: " +
		          e.getMessage());
		  }
	}

	/**
	 * Print a detailed report of Stocks and Values
	 */
	@Override
	public void printReport() 
	{
		try
		{
			JSONObject rootObject=(JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stock.json"));
			
			String stockAcc[]= {"Google","TCS","Mphasis"};
			for (int i = 0; i < stockAcc.length; i++) 
			{
				System.out.println("Stock Account : "+stockAcc[i]);
				System.out.println();
				JSONObject stockObject=(JSONObject )rootObject.get(stockAcc[i]);
				String stock_name=(String)stockObject.get("stock_name");
				stockModel.setStock_name(stock_name);
				System.out.println("Stock Name : "+stockModel.getStock_name());
				
				long number_of_shares=(long)stockObject.get("number_of_shares");
				stockModel.setNumber_of_shares(number_of_shares);
				System.out.println("Number_of_shares : "+stockModel.getNumber_of_shares());
				
				long share_price=(long)stockObject.get("share_price");
				stockModel.setShare_price(share_price);
				System.out.println("Share_price : "+stockModel.getShare_price());
				System.out.println("***********************************************");
			}
			
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		catch (ParseException e) {e.printStackTrace();}
	}

}
