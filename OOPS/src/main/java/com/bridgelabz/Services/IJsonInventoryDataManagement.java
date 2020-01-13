package com.bridgelabz.Services;

import org.json.simple.JSONObject;

/**
 * Interface for IJsonInventoryDataManagement
 * @author user
 *
 */
public interface IJsonInventoryDataManagement
{
	void readInventoryItems();
	void writeInventoryItems();
	JSONObject readInventoryObject();
}
