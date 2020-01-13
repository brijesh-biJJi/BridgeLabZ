package com.bridgelabz.Controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.ServiceImplementation.JsonInventoryDataManagementImpl;

public class JsonInventoryDataManagement extends JsonInventoryDataManagementImpl
{
	static JsonInventoryDataManagementImpl inventoryFactory=new JsonInventoryDataManagementImpl();
	public static void main(String[] args)
	{
		long grandTotal=0;
		JSONObject rootObject=inventoryFactory.readInventoryObject();
		
		String[] arrayName= {"Rice","Wheat"};
		for (int i = 0; i < arrayName.length; i++) 
		{
			JSONArray invenArray=(JSONArray)rootObject.get(arrayName[i]);
			Iterator<Object> iter=invenArray.iterator();
			while(iter.hasNext())
			{
				JSONObject inventoryDetails=(JSONObject) iter.next();
				long total=(long)inventoryDetails.get("Total");
				grandTotal += total;
			}
		}
		rootObject.put("Grand Total", grandTotal);
		PrintWriter printWrite=null;
		try
		{
			printWrite=new PrintWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/inventoryDataOutput.json");
			System.out.println("JSON Inventory Data Management Details are stored Into Inventory Data Output File...");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		printWrite.write(rootObject.toJSONString());
		printWrite.close();
	}

}
