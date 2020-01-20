package com.bridgelabz.CreationalDesignPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest 
{

	public static void main(String[] args) 
	{
		EagerInitializedSingleton eagerobj=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eagerobj1=null;
		
		Constructor[] constructor=EagerInitializedSingleton.class.getDeclaredConstructors();
		for (Constructor con : constructor) 
		{
			/**
			 * Below code will destroy the singleton pattern
			 */
			con.setAccessible(true);
			try {
				eagerobj1=(EagerInitializedSingleton) con.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {e.printStackTrace();}
			break;
		}
		System.out.println(eagerobj.hashCode());
		System.out.println(eagerobj1.hashCode());
	}

}
