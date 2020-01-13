package com.bridgelabz.Services;


/**
 * Interface of StockAccount
 * @author user
 *
 */
public interface IStockAccount 
{
	double valueOF();
	void buy(int amount,String symbol);
	void sell(int amount,String symbol);
	void save(String fileName);
	void printReport();
}
