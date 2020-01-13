package com.bridgelabz.Model;

/**
 * Model class for JsonInventoryDataManagement
 * @author user
 *
 */
public class JsonInventoryDataManagementModel 
{
	private String name;
	private long weight;
	private long price_per_kg;
	private long total;
	
	/**
	 * Get inventory item name
	 * @return
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Set inventory item name
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get inventory item weight
	 * @return
	 */
	public long getWeight() 
	{
		return weight;
	}
	
	/**
	 * Set inventory item weight
	 * @param weight
	 */
	public void setWeight(long weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Get price_per_kg
	 * @return
	 */
	public long getPrice_per_kg()
	{
		return price_per_kg;
	}
	
	/**
	 * Set price_per_kg
	 * @param price_per_kg
	 */
	public void setPrice_per_kg(long price_per_kg) 
	{
		this.price_per_kg = price_per_kg;
	}
	
	/**
	 *get totalprice 
	 * @return
	 */
	public long getTotal() {
		return total;
	}
	
	/**
	 * set totalprice
	 * @param total
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	
	
}
