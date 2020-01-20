package com.bridgelabz.CreationalDesignPatterns.Singleton;

public class SingletonTest 
{
	public static void main(String[] args) 
	{
		//EagerInitializedSingleton eagerObj=EagerInitializedSingleton.getInstance();
		//StaticBlockSingleton saticObj=StaticBlockSingleton.getInstance();
		LazyInitializedSingleton lazyobj=LazyInitializedSingleton.getInstance();
	}

}
