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
		
		//JSONObject rootObject=new JSONObject();
		
		
		JSONObject personObject=new JSONObject();
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
		
		personObject.put(addBookModel.getPhone(), personDetails);
		
		try{
			  FileWriter fstream = new FileWriter("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(personObject.toJSONString()+"\n");
			  out.close();
		  }catch (Exception e){
			 System.err.println("Error while writing to file: " +
		          e.getMessage());
		  }
		
		
		System.out.println("\nPerson Added into Address Book and Stored into File...");
		
	}

	/*@Override
	public JSONObject editAddressBook(String personObj) 
	{
		JSONObject root = null;
		try 
		{
			root = (JSONObject)jsonParser.parse(new FileReader("/home/user/GitBridgelabz/BridgeLabZ/OOPS/src/main/java/com/bridgelabz/Repo/addressBook.json"));
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (ParseException e) {	e.printStackTrace();}
		return root;
	}

	@Override
	public JSONObject deleteAddressBook(JSONObject personObj)
	{
		return null;
	}

	@Override
	public void selectAddressBook(JSONObject personObj)
	{
		
	}*/
	
}
