package com.bridgelabz.Services;

import org.json.simple.JSONObject;

public interface IAddressBook 
{
	void addAddressBook();
	void editAddressBook(String personObj);
	void deleteAddressBook(String personObj);
	void selectAddressBook(String personObj);
}
