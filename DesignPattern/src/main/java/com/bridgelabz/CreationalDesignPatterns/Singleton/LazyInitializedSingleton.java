package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class LazyInitializedSingleton 
{
	public static LazyInitializedSingleton instance;
	
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private LazyInitializedSingleton()
	{
		System.out.println("Instance Created..");
	}
	
	public static LazyInitializedSingleton getInstance()
	{
		if(instance==null)
			instance=new LazyInitializedSingleton();
		return instance;
	}
}
