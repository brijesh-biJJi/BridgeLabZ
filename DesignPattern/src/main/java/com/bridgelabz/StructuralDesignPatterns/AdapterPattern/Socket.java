package com.bridgelabz.StructuralDesignPatterns.AdapterPattern;

public class Socket
{
	public Volt getVolt()
	{
		return new Volt(120);
	}
}
