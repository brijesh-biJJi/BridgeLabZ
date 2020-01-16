package com.bridgelabz.ServiceImplementation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.Model.AddressBookModel;
import com.bridgelabz.Services.IAddressBook;
import com.bridgelabz.inputscanner.InputScanner;

public class AddressBookImpl implements IAddressBook
{
	/*AddressBookModel addBookModel=new AddressBookModel();
	JSONParser jsonParser=new JSONParser();
	@Override
	public void addAddressBook() 
	{
		String fname,lname,city,state,zip,address,phone;
		
		JSONObject rootObject=new JSONObject();
		
		
		JSONObject personObject=new JSONObject();
		JSONObject addObject=new JSONObject();
		JSONObject personDetails=new JSONObject();
		
		System.out.println("Enter the Person First Name..");
		fname=InputScanner.inputWord();
		addBookModel.setFname(fname);
		personDetails.put("first_name", addBookModel.getFname());
		
		System.out.println("Enter the Person Last Name..");
		lname=InputScanner.inputWord();
		addBookModel.setFname(lname);
		personDetails.put("last_name", addBookModel.getLname());
		
		System.out.println("Enter the Person city Name..");
		city=InputScanner.inputWord();
		addBookModel.setFname(city);
		personDetails.put("city", addBookModel.getCity());
		
		System.out.println("Enter the Person State Name..");
		state=InputScanner.inputWord();
		addBookModel.setFname(state);
		personDetails.put("state", addBookModel.getState());
		
		System.out.println("Enter the Zip..");
		zip=InputScanner.inputWord();
		addBookModel.setFname(zip);
		personDetails.put("zip", addBookModel.getZip());
		
		System.out.println("Enter the Phone..");
		phone=InputScanner.inputWord();
		addBookModel.setFname(phone);
		personDetails.put("zip", addBookModel.getPhone());
		
		
		System.out.println("Enter the Person Adress..");
		address=InputScanner.inputWord();
	}

	@Override
	public JSONObject editAddressBook(String personObj) 
	{
		return null;
	}

	@Override
	public JSONObject deleteAddressBook(JSONObject personObj)
	{
		return null;
	}

	@Override
	public void selectAddressBook(JSONObject personObj)
	{
		
	}
	*/
}
