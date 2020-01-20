package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class EagerInitializedSingleton 
{
	private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
	
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private EagerInitializedSingleton()
	{
		System.out.println("Instance Created..");
	}
	
	public static EagerInitializedSingleton getInstance()
	{
		return instance;
	}
	
}
