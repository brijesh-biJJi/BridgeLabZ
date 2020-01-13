package com.bridgelabz.ServiceImplementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Model.StockAccountManagementModel;
import com.bridgelabz.Services.IStockAccountManagement;

/**
 * Implementation class of StockAccountManagement
 * @author user
 *
 */
public class StockAccountManagementImpl implements IStockAccountManagement
{
	StockAccountManagementModel stockmodel=new StockAccountManagementModel();

	JSONParser jsonParser=new JSONParser();
	
	/**
	 * Method to read Stock Data from file
	 */
	@Override
	public JSONObject readStockData()
	{
		long totalValue=0,grandTotal=0;
		
		JSONObject root=new JSONObject();
		try 
		{
			/**
			 * Reading the data from Json File
			 */
			JSONObject rootObject=(JSONObject) jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stock.json"));
			
			
			String[] stockNames= {"Google","TCS","Mphasis"};
			System.out.println("*****Stock Account Management Details*****\n");
			for (int i = 0; i < stockNames.length; i++) 
			{
				System.out.println(stockNames[i]+" Stock Details : \n");
				
				JSONObject stockObject=(JSONObject)rootObject.get(stockNames[i]);
				JSONObject stockObj=new JSONObject();
				
				String stock_name=(String)stockObject.get("stock_name");
				stockmodel.setStock_name(stock_name);
				System.out.println("Stock Name : "+stockmodel.getStock_name());
				
				stockObj.put("Stock Name", stockmodel.getStock_name());
				
				long number_of_shares=(long)stockObject.get("number_of_shares");
				stockmodel.setNumber_of_shares(number_of_shares);
				System.out.println("Number Of Shares : "+stockmodel.getNumber_of_shares());
				
				stockObj.put("Number Of Shares", stockmodel.getNumber_of_shares());
				
				long share_price=(long)stockObject.get("share_price");
				stockmodel.setShare_price(share_price);
				System.out.println("Share Prices : "+stockmodel.getShare_price());
				
				stockObj.put("Share Prices", stockmodel.getShare_price());
				
				totalValue += stockmodel.getShare_price() * stockmodel.getNumber_of_shares();
				stockmodel.setTotalValue(totalValue);
				System.out.println("Total ShareValue : "+stockmodel.getTotalValue());
				
				stockObj.put("Total ShareValue",stockmodel.getTotalValue());
				
				System.out.println("*****************************************************");
				grandTotal += stockmodel.getTotalValue();
				totalValue=0;
				root.put(stockNames[i], stockObj);
			}
			
			System.out.println("Grand total : "+ grandTotal);
			
			root.put("Grand total", grandTotal);
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		catch (ParseException e) {e.printStackTrace();}
		return root;
	}
	
	/**
	 * Method to write the Stock Data into File
	 */
	@Override
	public void writeStockData() 
	{
		JSONObject root=readStockData();
		PrintWriter printWrite=null;
		try
		{
			printWrite=new PrintWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/stockOutput.json");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		printWrite.write(root.toJSONString());
		printWrite.close();
		System.out.println("\nStock Account Management Data's Stored into the File...");
	}

}
