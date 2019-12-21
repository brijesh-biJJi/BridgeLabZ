package com.bridgelabz.inputscanner;

import java.util.Scanner;

public class InputScanner 
{
	static final Scanner sc=new Scanner(System.in);
	
	//Returns Integer
	public static int inputInteger()
	{
			return sc.nextInt();		
	}
	
	//Returns Double
	public static double inputDouble()
	{
		return sc.nextDouble();
	}
	
	//Returns String
	public static String inputWord()
	{
			return sc.next();
	}
	
	//Returns Character
	public static Character inputCharacter()
	{
		return sc.next().charAt(0);
	}
	
	
}
