package com.bridgelabz.StructuralDesignPatterns.AdapterPattern;

public interface ISocketAdapter 
{
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();
}
