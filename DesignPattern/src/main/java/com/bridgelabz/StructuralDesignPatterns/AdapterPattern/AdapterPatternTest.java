package com.bridgelabz.StructuralDesignPatterns.AdapterPattern;

import java.net.SocketAddress;

public class AdapterPatternTest 
{

	public static void main(String[] args) 
	{
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() 
	{
		ISocketAdapter socketAdapter=new SocketObjectAdapterImpl();
		Volt v3=getVolt(socketAdapter,3);
		Volt v12=getVolt(socketAdapter, 12);
		Volt v120=getVolt(socketAdapter, 120);
		
		System.out.println("Test Object Adapter");
		System.out.println("*******************");
		System.out.println("V3 volts using Class Adapter :"+v3.getVolts());
		System.out.println("V12 volts using Class Adapter :"+v12.getVolts());
		System.out.println("V120 volts using Class Adapter :"+v120.getVolts());
	
	}

	private static void testClassAdapter() 
	{
		ISocketAdapter socketAdapter=new SocketClassAdapterImpl();
		Volt v3=getVolt(socketAdapter,3);
		Volt v12=getVolt(socketAdapter, 12);
		Volt v120=getVolt(socketAdapter, 120);
		
		System.out.println("Test Class Adapter");
		System.out.println("******************");
		System.out.println("V3 volts using Class Adapter :"+v3.getVolts());
		System.out.println("V12 volts using Class Adapter :"+v12.getVolts());
		System.out.println("V120 volts using Class Adapter :"+v120.getVolts());
		System.out.println();
	}

	private static Volt getVolt(ISocketAdapter socketAdapter, int i) 
	{
		switch(i)
		{
			case 3: return socketAdapter.get3Volt();
			case 12: return socketAdapter.get12Volt();
			case 120: return socketAdapter.get120Volt();
			
			default: return socketAdapter.get120Volt();
		}
	}

}
