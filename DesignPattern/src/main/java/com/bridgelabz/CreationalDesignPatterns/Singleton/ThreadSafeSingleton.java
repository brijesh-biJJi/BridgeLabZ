package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class ThreadSafeSingleton 
{
private static ThreadSafeSingleton instance;
	
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private ThreadSafeSingleton()
	{
		System.out.println("ThreadSafeSingleton Instance Created..");
	}
	
	/*public static synchronized ThreadSafeSingleton getInstance()
	{
		if(instance==null)
			instance=new ThreadSafeSingleton();
		return instance;
	}*/
	
	/**
	 * Double-checked locking implementation.
	 */
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
	{
		if(instance==null)
		{
			synchronized(ThreadSafeSingleton.class)
			{
				if(instance==null)
					instance=new ThreadSafeSingleton();
			}
		}
		return instance;
	}
}
