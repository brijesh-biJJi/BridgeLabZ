package com.bridgelabz.CreationalDesignPatterns.FactoryPattern;


public abstract class Computer
{
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString()
	{
		return "RAM : "+this.getRam()+"\nHardDiskDrive : "+this.getHDD()+"\nCPU : "+this.getCPU();
	}
}
