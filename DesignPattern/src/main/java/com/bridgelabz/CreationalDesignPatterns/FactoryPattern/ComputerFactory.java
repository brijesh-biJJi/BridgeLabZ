package com.bridgelabz.CreationalDesignPatterns.FactoryPattern;

/**
 * Computer Factory class
 * @author user
 *
 */
public class ComputerFactory 
{
	public static Computer getComputer(String type,String ram,String hdd,String cpu)
	{
		if(type.equalsIgnoreCase("PC"))
			return new PC(ram,hdd,cpu);
		
		else if(type.equalsIgnoreCase("Server"))
			return new Server(ram,hdd,cpu);
		
		else if(type.equalsIgnoreCase("Laptop"))
			return new Laptop(ram,hdd,cpu);
		
		else
			return null;
	}
}
