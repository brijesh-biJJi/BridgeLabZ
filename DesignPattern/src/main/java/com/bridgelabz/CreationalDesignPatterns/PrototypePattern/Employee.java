package com.bridgelabz.CreationalDesignPatterns.PrototypePattern;

import java.util.*;

import com.bridgelabz.InputScanner.InputScanner;

public class Employee implements Cloneable
{

	List<String> empList=new ArrayList<>();
	
	public void loadData()
	{
		System.out.println("Enter the no of Employee");
		int n=InputScanner.inputInteger();
		System.out.println("Enter "+n+" Employee name");
		String e="";
		for (int i = 1; i <= n; i++)
		{
			e=InputScanner.inputWord();
			empList.add(e);
		}
		
	}

	public List<String> getEmpList() 
	{
		return empList;
	}
	
	@Override
	protected Employee clone() throws CloneNotSupportedException 
	{
		Employee e=new Employee();
		for (String n : this.getEmpList()) {
			e.getEmpList().add(n);	
		}
		
		return e;
	}
	
}
