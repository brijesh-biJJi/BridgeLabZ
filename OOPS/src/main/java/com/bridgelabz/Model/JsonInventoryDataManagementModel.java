package com.bridgelabz.Model;

public class JsonInventoryDataManagementModel 
{
	private String name;
	private double weight;
	private double price_per_kg;
	private double total;
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getWeight() 
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getPrice_per_kg()
	{
		return price_per_kg;
	}
	public void setPrice_per_kg(double price_per_kg) 
	{
		this.price_per_kg = price_per_kg;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
