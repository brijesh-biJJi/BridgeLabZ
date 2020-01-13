package com.bridgelabz.Model;

public class StockAccountManagementModel 
{
	private String stock_name;
	private long number_of_shares;
	private long  share_price;
	private long totalValue;
	
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public long getNumber_of_shares() {
		return number_of_shares;
	}
	public void setNumber_of_shares(long number_of_shares) {
		this.number_of_shares = number_of_shares;
	}
	public long getShare_price() {
		return share_price;
	}
	public void setShare_price(long share_price) {
		this.share_price = share_price;
	}
	public long getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(long totalValue) {
		this.totalValue = totalValue;
	}
	
	
}
