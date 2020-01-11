package com.bridgelabz.ServiceImplementation;



import java.io.*;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Model.JsonInventoryDataManagementModel;
import com.bridgelabz.Services.IJsonInventoryDataManagement;
import com.bridgelabz.inputscanner.InputScanner;

public class JsonInventoryDataManagementImpl implements IJsonInventoryDataManagement
{
	JsonInventoryDataManagementModel inventoryModel=new JsonInventoryDataManagementModel();

	JSONParser parser=new JSONParser();
	
	@Override
	public void addInventoryItems() 
	{
		
		
		
		
		
		
		double total=0;
		System.out.println("Enter the Item name to add..");
		String itemName=InputScanner.inputWord();
		
		System.out.println("Enter the weight..");
		double weight=InputScanner.inputDouble();
		
		System.out.println("Enter the price_per_kg");
		double price_per_kg=InputScanner.inputDouble();
		
		inventoryModel.setName(itemName);
		inventoryModel.setWeight(weight);
		inventoryModel.setPrice_per_kg(price_per_kg);
		total += weight*price_per_kg;
		inventoryModel.setTotal(total);
	}

	@Override
	public void saveInventoryItems() 
	{
		try 
		{
			//Object inventoryObj=parser.parse(new FileReader("inventoryData.json"));
			//JSONObject jsonObject=(JSONObject)inventoryObj;
			JSONObject jsonObject=(JSONObject) parser.parse(new FileReader("/home/user/Desktop/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/inventoryData.json"));
			
			JSONArray rice=(JSONArray)jsonObject.get("rice");
			JSONArray wheat=(JSONArray)jsonObject.get("wheat");
						
			Iterator<Object> iter=rice.iterator();
			while(iter.hasNext())
			{
				System.out.print("Rice : ");
				System.out.println(iter.next());
			}
			Iterator<Object> iter1=wheat.iterator();
			while(iter1.hasNext())
			{
				System.out.print("Wheat : ");
				System.out.println(iter1.next());
			}
			
		} 
		catch (FileNotFoundException e) { e.printStackTrace();}
		catch (IOException e) { e.printStackTrace();}
		catch (ParseException e) { e.printStackTrace();}
		catch (Exception e) { e.printStackTrace();}
		/*System.out.println("Inventory Item Name : "+inventoryModel.getName());
		System.out.println("Inventory Item weight : "+inventoryModel.getWeight());
		System.out.println("Inventory Item price_per_kg : "+inventoryModel.getPrice_per_kg());
		System.out.println("Inventory Total Amount : "+inventoryModel.getTotal());*/
	}
	
}
