package com.bridgelabz.CreationalDesignPatterns.PrototypePattern;

public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee emp=new Employee();
		emp.loadData();
		
		
		Employee emp1=emp.clone();
		Employee emp2=emp.clone();
		
		emp.getEmpList().remove("a");
		emp1.getEmpList().remove("b");
		
		System.out.println("Employee List : "+emp.getEmpList());
		System.out.println("Employee List 1 : "+emp1.getEmpList());
		System.out.println("Employee List 2 : "+emp2.getEmpList());
	}

}
