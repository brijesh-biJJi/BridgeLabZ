package com.bridgelabz.Model;

public class JsonInventoryDataManagementModel 
{
	private String name;
	private long weight;
	private long price_per_kg;
	private long total;
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public long getWeight() 
	{
		return weight;
	}
	public void setWeight(long weight)
	{
		this.weight = weight;
	}
	public long getPrice_per_kg()
	{
		return price_per_kg;
	}
	public void setPrice_per_kg(long price_per_kg) 
	{
		this.price_per_kg = price_per_kg;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	
}
