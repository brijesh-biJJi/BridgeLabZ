package com.bridgelabz.ServiceImplementation;



import org.json.simple.parser.JSONParser;

import com.bridgelabz.Model.JsonInventoryDataManagementModel;
import com.bridgelabz.Services.IJsonInventoryDataManagement;
import com.bridgelabz.inputscanner.InputScanner;

public class JsonInventoryDataManagementImpl implements IJsonInventoryDataManagement
{
	JsonInventoryDataManagementModel inventoryModel=new JsonInventoryDataManagementModel();

	
	@Override
	public void addInventoryItems() 
	{
		JSONParser parser=new JSONParser();
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
		
		System.out.println("Inventory Item Name : "+inventoryModel.getName());
		System.out.println("Inventory Item weight : "+inventoryModel.getWeight());
		System.out.println("Inventory Item price_per_kg : "+inventoryModel.getPrice_per_kg());
		System.out.println("Inventory Total Amount : "+inventoryModel.getTotal());
	}
	
}
