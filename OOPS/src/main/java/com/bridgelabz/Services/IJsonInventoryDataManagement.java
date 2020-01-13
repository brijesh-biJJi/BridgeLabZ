package com.bridgelabz.Services;

import org.json.simple.JSONObject;

public interface IJsonInventoryDataManagement
{
	void readInventoryItems();
	void writeInventoryItems();
	JSONObject readInventoryObject();
}
