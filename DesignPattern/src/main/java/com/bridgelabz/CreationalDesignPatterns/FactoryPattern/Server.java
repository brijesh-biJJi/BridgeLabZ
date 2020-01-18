package com.bridgelabz.CreationalDesignPatterns.FactoryPattern;

public class Server extends Computer
{

	String Ram,HDD,CPU;
	
	/**
	 * Parameterized Constructor of Server Class
	 * @param ram
	 * @param hdd
	 * @param cpu
	 */
	Server(String ram,String hdd,String cpu)
	{
		this.Ram=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	
	@Override
	public String getRam() 
	{
		return this.Ram;
	}

	@Override
	public String getHDD() 
	{
		return this.HDD;
	}

	@Override
	public String getCPU() 
	{
		return this.CPU;
	}
	
}
