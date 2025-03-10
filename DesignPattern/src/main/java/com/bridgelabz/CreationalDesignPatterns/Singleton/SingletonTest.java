package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class SingletonTest 
{
	public static void main(String[] args) 
	{
		EagerInitializedSingleton eagerObj=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eagerObj1=EagerInitializedSingleton.getInstance();
		//StaticBlockSingleton saticObj=StaticBlockSingleton.getInstance();
		//LazyInitializedSingleton lazyobj=LazyInitializedSingleton.getInstance();
		//ThreadSafeSingleton threadObj=ThreadSafeSingleton.getInstance();
		//ThreadSafeSingleton threadObj1=ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		//BillPughSingleton billPughobj=BillPughSingleton.getInstance();
		EnumSingleton enumObj=EnumSingleton.INSTANCE;
		enumObj.i=5;
		enumObj.show();
		
		EnumSingleton enumObj1=EnumSingleton.INSTANCE;
		enumObj1.i=6;
		enumObj.show();
	}
}
