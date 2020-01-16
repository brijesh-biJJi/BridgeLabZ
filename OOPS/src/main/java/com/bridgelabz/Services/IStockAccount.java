package com.bridgelabz.Services;

import org.json.simple.JSONObject;

/**
 * Interface of StockAccount
 * @author user
 *
 */
public interface IStockAccount 
{
	double valueOF();
	void buy(long amount,String symbol);
	void sell(long amount,String symbol);
	void save(JSONObject jsonObj);
	void printReport();
}
