package com.bridgelabz.CreationalDesignPatterns.Singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable
{

	private static final long serialVersionUID = -7604766932017737115L;
	/**
	 * Private Constructor to avoid client applications to use constructor
	 */
	private SerializedSingleton()
	{
		System.out.println("SerializedSingleton Instance Created..");
	}
	
	/**
	 * private inner class
	 * @author user
	 *
	 */
	private static class SingletonHelper
	{
		private static final SerializedSingleton instance=new SerializedSingleton();
	}
	
	/**
	 * Returns the instance
	 * @return
	 */
	public static SerializedSingleton getInstance()
	{
		return SingletonHelper.instance;
	}
	
	/**
	 * returns the old original instance
	 * @return
	 */
	protected Object readResolve() {
	    return getInstance();
	}
}
