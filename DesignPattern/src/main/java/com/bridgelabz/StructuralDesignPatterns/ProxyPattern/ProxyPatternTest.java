package com.bridgelabz.StructuralDesignPatterns.ProxyPattern;

public class ProxyPatternTest 
{
	public static void main(String[] args) 
	{
		CommandExecutor executor=new CommandExecutorProxy("Brijesh", "wrong_password");
		try {
			executor.runCommand("ls -ltr ");
			executor.runCommand(" rm -rf abc.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Occured : "+e.getMessage());
		}
		
		
		
	}
}
