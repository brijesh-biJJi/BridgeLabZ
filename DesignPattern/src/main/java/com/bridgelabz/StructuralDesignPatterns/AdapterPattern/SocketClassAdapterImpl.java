package com.bridgelabz.StructuralDesignPatterns.AdapterPattern;

public class SocketClassAdapterImpl extends Socket implements ISocketAdapter
{

	@Override
	public Volt get120Volt() 
	{
		return getVolt();
	}

	@Override
	public Volt get12Volt() 
	{
		Volt v=getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() 
	{
		Volt v=getVolt();
		return convertVolt(v, 40);
	}
	
	public Volt convertVolt(Volt v,int div)
	{
		return new Volt(v.getVolts() / div);
	}

}
