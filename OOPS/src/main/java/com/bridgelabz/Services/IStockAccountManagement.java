package com.bridgelabz.Services;

import org.json.simple.JSONObject;

public interface IStockAccountManagement 
{
	JSONObject readStockData();
	void writeStockData();
}
