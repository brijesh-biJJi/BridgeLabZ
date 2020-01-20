package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class BillPughSingleton
{
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private BillPughSingleton()
	{
		System.out.println("BillPughSingleton Instance Created..");
	}
	
	private static class SingletonHelper
	{
		private static final BillPughSingleton instance=new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.instance;
	}
}
