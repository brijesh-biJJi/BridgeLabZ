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

	JSONParser jsonParser=new JSONParser();


	@Override
	public void readInventoryItems() 
	{
		try 
		{
			JSONObject jsonObject=(JSONObject) jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/inventoryData.json"));
			long grandTotal=0;
			String[] names={"Rice","Wheat","Pulse"};
			for(int i=0; i<names.length;i++)
			{
				long total = 0;
				JSONArray arrayName=(JSONArray)jsonObject.get(names[i]);
				Iterator<Object> iter=arrayName.iterator();
				
				
				System.out.println(names[i]+" Items :");
				while(iter.hasNext())
				{
					JSONObject inventoryDetails=(JSONObject) iter.next();
					System.out.print(names[i]+" Name: ");
					String name=(String)inventoryDetails.get("name");
					inventoryModel.setName(name);
					System.out.println(inventoryModel.getName());
					
					System.out.print(names[i]+" Weight: ");
					long weight=(long)inventoryDetails.get("weight");
					inventoryModel.setWeight(weight);
					System.out.println(inventoryModel.getWeight());
					
					
					System.out.print(names[i]+" Price_Per_Kg: ");
					long price_per_kg=(long)inventoryDetails.get("price_per_kg");
					inventoryModel.setPrice_per_kg(price_per_kg);
					System.out.println(inventoryModel.getPrice_per_kg());
					System.out.println();
					total += inventoryModel.getWeight() * inventoryModel.getPrice_per_kg();
				}
				inventoryModel.setTotal(total);
				System.out.println(names[i]+" Total : "+inventoryModel.getTotal());
				System.out.println("******************************************************");
			}
			
		} 
		catch (FileNotFoundException e) { e.printStackTrace();}
		catch (IOException e) { e.printStackTrace();}
		catch (ParseException e) { e.printStackTrace();}
		catch (Exception e) { e.printStackTrace();}
		
	}

	@Override
	public void writeInventoryItems() 
	{
		JSONObject rootObject=new JSONObject();
		long grandTotal=0;
		String[] arrayNames= {"Rice","Wheat","Pulse"};
		for(int i=0;i<arrayNames.length;i++)
		{
			JSONArray inventoryArray=new JSONArray();
			System.out.println("Enter the total number of "+arrayNames[i]+" Items..");
			int c=InputScanner.inputInteger();
			long total=0;
			for(int j=0;j<c;j++)
			{
				JSONObject inventoryItems=new JSONObject();
				System.out.println("Enter the "+arrayNames[i]+" name..");
				String name=InputScanner.inputWord();
				inventoryItems.put("Name", name);
				
				System.out.println("Enter the "+arrayNames[i]+" weight..");
				long weight=InputScanner.inputInteger();
				inventoryItems.put("Weight",weight);
				
				System.out.println("Enter the "+arrayNames[i]+" price_per_kg..");
				long price_per_kg=InputScanner.inputInteger();
				inventoryItems.put("Price_Per_Kg",price_per_kg);
				
				total += price_per_kg * weight;
				inventoryItems.put("Total", total);
				grandTotal +=total;
				total=0;
				
				inventoryArray.add(inventoryItems);
			}
			rootObject.put(arrayNames[i], inventoryArray);
		}
		rootObject.put("Grand Total: ", grandTotal);
		
		PrintWriter printWrite=null;
		try
		{
			printWrite=new PrintWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/inventoryDataOutput.json");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		printWrite.write(rootObject.toJSONString());
		printWrite.close();
	}

	@Override
	public JSONObject readInventoryObject() 
	{
		System.out.println("***...Json Inventory Data Management...***");
		JSONObject rootObject=new JSONObject();
		try 
		{
			JSONObject jsonObject=(JSONObject) jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/inventoryData.json"));
			
			String[] names={"Rice","Wheat","Pulse"};
			for(int i=0; i<names.length;i++)
			{
				JSONArray inventoryArray=new JSONArray();
				long total = 0;
				JSONArray arrayName=(JSONArray)jsonObject.get(names[i]);
				Iterator<Object> iter=arrayName.iterator();
				while(iter.hasNext())
				{
					JSONObject inventoryItems=new JSONObject();
					
					JSONObject inventoryDetails=(JSONObject) iter.next();
					
					String name=(String)inventoryDetails.get("name");
					inventoryModel.setName(name);
					inventoryItems.put("Name", inventoryModel.getName());
					
					
					long weight=(long)inventoryDetails.get("weight");
					inventoryModel.setWeight(weight);
					inventoryItems.put("Weight",inventoryModel.getWeight());
					
					
					long price_per_kg=(long)inventoryDetails.get("price_per_kg");
					inventoryModel.setPrice_per_kg(price_per_kg);
					inventoryItems.put("Price_Per_Kg", inventoryModel.getPrice_per_kg());
					
				
					total += inventoryModel.getWeight() * inventoryModel.getPrice_per_kg();
					
					inventoryModel.setTotal(total);
					inventoryItems.put("Total", inventoryModel.getTotal());
					
					total=0;
					
					inventoryArray.add(inventoryItems);
				}
				rootObject.put(names[i], inventoryArray);
			}
		} 
		catch (FileNotFoundException e) { e.printStackTrace();}
		catch (IOException e) { e.printStackTrace();}
		catch (ParseException e) { e.printStackTrace();}
		catch (Exception e) { e.printStackTrace();}
		return rootObject;
	}
	
}
