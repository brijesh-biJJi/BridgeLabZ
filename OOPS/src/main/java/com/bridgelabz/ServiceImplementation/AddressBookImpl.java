package com.bridgelabz.ServiceImplementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.Model.AddressBookModel;
import com.bridgelabz.Services.IAddressBook;
import com.bridgelabz.inputscanner.InputScanner;

public class AddressBookImpl implements IAddressBook
{
	AddressBookModel addBookModel=new AddressBookModel();
	JSONParser jsonParser=new JSONParser();
	@Override
	public void addAddressBook() 
	{
		String fname,lname,city,state,zip,address=null,phone;
		
		JSONObject root = null;
		try 
		{
			root = (JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json"));
			
		
		
		//JSONObject personObject=new JSONObject();
		//JSONObject addressObject=new JSONObject();
		JSONObject personDetails=new JSONObject();
		
		System.out.println("Enter the Person First Name..");
		fname=InputScanner.inputWord();
		addBookModel.setFname(fname);
		personDetails.put("first_name", addBookModel.getFname());
		
		System.out.println("Enter the Person Last Name..");
		lname=InputScanner.inputWord();
		addBookModel.setLname(lname);
		personDetails.put("last_name", addBookModel.getLname());
		
		System.out.println("Enter the Person city Name..");
		city=InputScanner.inputWord();
		addBookModel.setCity(city);
		personDetails.put("city", addBookModel.getCity());
		
		System.out.println("Enter the Person State Name..");
		state=InputScanner.inputWord();
		addBookModel.setState(state);
		personDetails.put("state", addBookModel.getState());
		
		System.out.println("Enter the Zip..");
		zip=InputScanner.inputWord();
		addBookModel.setZip(zip);
		personDetails.put("zip", addBookModel.getZip());
		
		System.out.println("Enter the Person Adress..");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			address=br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		personDetails.put("Address", address);
		
		System.out.println("Enter the Phone..");
		phone=InputScanner.inputWord();
		addBookModel.setPhone(phone);
		
		root.put(addBookModel.getPhone(), personDetails);
		
		try{
			  FileWriter fstream = new FileWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json");
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(root.toJSONString()+"\n");
			  out.close();
		  }catch (Exception e){
			 System.err.println("Error while writing to file: " +
		          e.getMessage());
		  }
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (ParseException e) {	e.printStackTrace();}
		
		System.out.println("\nPerson Added into Address Book and Stored into File...");
		
	}

	@Override
	public void editAddressBook(String personObj) 
	{
		JSONObject root = null;
		try 
		{
			root = (JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json"));
			
			JSONObject personDetails=(JSONObject)root.get(personObj);
			
			System.out.println("Enter the Key To Update in AddressBook...\n last_name\n city\n state \nzip \nAddress");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String edit = null,update=null;
			try {
				edit=br.readLine();
				System.out.println("Enter the new "+edit+ "to Update..");
				update=br.readLine();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			personDetails.remove(edit);
			personDetails.put(edit, update);
			root.put(personObj, personDetails);
			System.out.println("Information Edited Successfully");
			
			try{
				  FileWriter fstream = new FileWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json");
				  BufferedWriter out = new BufferedWriter(fstream);
				  out.write(root.toJSONString()+"\n");
				  out.close();
			  }catch (Exception e){
				 System.err.println("Error while writing to file: " +
			          e.getMessage());
			  }
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (ParseException e) {	e.printStackTrace();}
	}

	@Override
	public void deleteAddressBook(String personObj1)
	{
		JSONObject root = null;
		try 
		{
			root = (JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json"));
			
			//JSONObject personDetails=(JSONObject)root.get(personObj1);
			
			
			root.remove(personObj1);
			System.out.println("Information Deleted Successfully");
			
			try{
				  FileWriter fstream = new FileWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json");
				  BufferedWriter out = new BufferedWriter(fstream);
				  out.write(root.toJSONString()+"\n");
				  out.close();
			  }catch (Exception e){
				 System.err.println("Error while writing to file: " +
			          e.getMessage());
			  }
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (ParseException e) {	e.printStackTrace();}
	}

	

	@Override
	public void displayAddressBook()
	{
		JSONObject root = null;
		try 
		{
			root = (JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json"));
			String[] phone= {"8970498816","7975097260"};
			
			for (int i = 0; i < phone.length; i++) 
			{
				JSONObject personDetails=(JSONObject)root.get(phone[i]);
				
				String fname=(String)personDetails.get("first_name");
				System.out.println("First Name : "+fname);
				
				String lname=(String)personDetails.get("last_name");
				System.out.println("Last Name : "+lname);
					
				String city=(String)personDetails.get("city");
				System.out.println("City : "+city);
				
				String state=(String)personDetails.get("state");
				System.out.println("State : "+state);
				
				String zip=(String)personDetails.get("zip");
				System.out.println("Zip : "+zip);
				
				System.out.println("Phone Number : "+phone[i]);
				System.out.println("****************************************************");
			}
			
		
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (ParseException e) {	e.printStackTrace();}
	}
	
}
