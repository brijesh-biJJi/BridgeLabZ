package com.bridgelabz.ServiceImplementation;



import java.io.*;
import java.util.ArrayList;
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
		System.out.println("hello");
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
			JSONObject jsonObject=(JSONObject) parser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/inventoryData.json"));
			
			/*JSONArray rice=(JSONArray)jsonObject.get("rice");
			JSONArray wheat=(JSONArray)jsonObject.get("wheat");
						
			Iterator<Object> iter=rice.iterator();
			while(iter.hasNext())
			{
				JSONObject obj=(JSONObject) iter.next();
				System.out.print("Rice Name: ");
				System.out.println(obj.get("name"));
				System.out.print("Rice Weight: ");
				System.out.println(obj.get("weight"));
				System.out.print("Rice Price_Per_Kg: ");
				System.out.println(obj.get("price_per_kg"));
				System.out.println("******************************************************");
			}
			Iterator<Object> iter1=wheat.iterator();
			while(iter1.hasNext())
			{
				JSONObject obj=(JSONObject) iter1.next();
				System.out.print("Wheat Name: ");
				System.out.println(obj.get("name"));
				System.out.print("Wheat Weight: ");
				System.out.println(obj.get("weight"));
				System.out.print("Wheat Price_Per_Kg: ");
				System.out.println(obj.get("price_per_kg"));
				System.out.println("******************************************************");
			}*/
			
		String[] names={"Rice","Wheat"};
			for(int i=0; i<names.length;i++)
			{
				JSONArray name1=(JSONArray)jsonObject.get(names[i]);
				Iterator<Object> iter=name1.iterator();
				System.out.println("******************************************************");
				System.out.println(names[i]+" Items ");
				while(iter.hasNext())
				{
					JSONObject inventoryNames=(JSONObject) iter.next();
					System.out.print(names[i]+" Name: ");
					System.out.println(inventoryNames.get("name"));
					System.out.print(names[i]+" Weight: ");
					System.out.println(inventoryNames.get("weight"));
					System.out.print(names[i]+" Price_Per_Kg: ");
					System.out.println(inventoryNames.get("price_per_kg"));
					System.out.println();
				}
			}
			
		} 
		catch (FileNotFoundException e) { e.printStackTrace();}
		catch (IOException e) { e.printStackTrace();}
		catch (ParseException e) { e.printStackTrace();}
		catch (Exception e) { e.printStackTrace();}
		
	}
	
}
