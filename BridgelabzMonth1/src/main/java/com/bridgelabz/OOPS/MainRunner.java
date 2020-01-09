package com.bridgelabz.OOPS;

public class MainRunner {

	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.setEmpNo(101);
		emp.setEmpName("Brijesh");
		emp.setSalary(25000);
		String jsonEmployee=JsonUtil.convertJavaToJson(emp);
		System.out.println("*...Converted Java To Json...*");
		System.out.println("\n"+jsonEmployee);
		
		System.out.println("\n\n**************************************************");
		System.out.println("*...Converted Json To Java...*");
		Employee emp1=JsonUtil.convertjsonToJava(jsonEmployee, Employee.class);
		System.out.println(emp1.getEmpNo());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getSalary());
	}

}
