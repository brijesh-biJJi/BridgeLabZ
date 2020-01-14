package com.bridgelabz.Services;


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
	void save(String fileName);
	void printReport();
}
