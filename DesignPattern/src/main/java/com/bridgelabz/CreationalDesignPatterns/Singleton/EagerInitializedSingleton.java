package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class EagerInitializedSingleton 
{
	private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
	
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private EagerInitializedSingleton()
	{
		System.out.println("EagerInitializedSingleton Instance Created..");
	}
	
	/**
	 * Returns the instance
	 * @return
	 */
	public static EagerInitializedSingleton getInstance()
	{
		return instance;
	}
	
}
