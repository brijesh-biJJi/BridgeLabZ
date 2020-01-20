package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class StaticBlockSingleton 
{
	private static StaticBlockSingleton instance;
	
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private StaticBlockSingleton()
	{ 
		System.out.println("StaticBlockSingleton Instance Created.");
	}
	
	/**
	 * static block initialization for exception handling
	 */
	static
	{
		try
		{
			instance=new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}
