package com.bridgelabz.inputscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner 
{
	//Creating Scanner class Object
	static final Scanner sc=new Scanner(System.in);
	
	//Returns Integer value
	public static int inputInteger()
	{
		try
		{
			return sc.nextInt();	
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Input Mismatch...\nEnter the proper input");
			return 0;
		}
	}
	
	//Returns Double value
	public static double inputDouble()
	{
		try
		{
			return sc.nextDouble();	
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Input Mismatch...\nEnter the proper input");
			return 0.0;
		}
		
	}
	
	//Returns String value
	public static String inputWord()
	{
		return sc.next();
	}
	
	//Returns Sentence
	public static String inputSentence()
	{
		return sc.nextLine();
	}
	
	//Returns Character value
	public static Character inputCharacter()
	{
		return sc.next().charAt(0);
	}
	
	
}

