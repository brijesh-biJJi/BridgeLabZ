package com.bridgelabz.CreationalDesignPatterns.PrototypePattern;

public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee emp=new Employee();
		emp.loadData();
		
		
		Employee emp1=(Employee)emp.clone();
		emp.getEmpList().re
		
		System.out.println("Employee List : "+emp.getEmpList());
		System.out.println("Employee List1 : "+emp1.getEmpList());
	}

}
