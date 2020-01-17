package com.bridgelabz.Model;

/**
 * Model Class of StockAccountManagementModel
 * @author user
 *
 */
public class StockAccountManagementModel 
{
	private String stock_name;
	private long number_of_shares;
	private long  share_price;
	private long totalValue;
	private String date;
	
	public String getDate() 
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	/**
	 * method to get Stock_name
	 * @return
	 */
	public String getStock_name()
	{
		return stock_name;
	}
	
	/**
	 * method to set Stock_name
	 * @param stock_name
	 */
	public void setStock_name(String stock_name) 
	{
		this.stock_name = stock_name;
	}
	
	/**
	 * method to get number of shares
	 * @return
	 */
	public long getNumber_of_shares() {
		return number_of_shares;
	}
	
	/**
	 * method to set number of shares
	 * @param number_of_shares
	 */
	public void setNumber_of_shares(long number_of_shares) 
	{
		this.number_of_shares = number_of_shares;
	}
	
	/**
	 * method to get share price
	 * @return
	 */
	public long getShare_price() {
		return share_price;
	}
	
	/**
	 * method to set share price
	 * @param share_price
	 */
	public void setShare_price(long share_price) 
	{
		this.share_price = share_price;
	}
	
	/**
	 * method to get total value
	 * @return
	 */
	public long getTotalValue() {
		return totalValue;
	}
	
	 /**
	  * method to set total value
	  * @param totalValue
	  */
	public void setTotalValue(long totalValue) 
	{
		this.totalValue = totalValue;
	}
	
	
}
