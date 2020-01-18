package com.bridgelabz.CreationalDesignPatterns.FactoryPattern;

import com.bridgelabz.InputScanner.InputScanner;

public class TestComputer {

	public static void main(String[] args) 
	{
		System.out.println("Enter the type of the Computer you want to Buy...!");
		String type=InputScanner.inputWord();
		
		Computer c=ComputerFactory.getComputer(type, "4 GB", "1 TB", "2.9 GHz");
		if(c !=null)
		{
			System.out.println("Factory "+type+" Config :");
			/*System.out.println("*******************");
			System.out.println("Ram : "+c.getRam());
			System.out.println("HardDiskDrive : "+c.getHDD());
			System.out.println("CPU : "+c.getCPU());*/
			
			System.out.println(c);
		}
	}

}
