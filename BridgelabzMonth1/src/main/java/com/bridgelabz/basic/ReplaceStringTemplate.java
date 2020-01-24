package com.bridgelabz.basic;

import com.bridgelabz.inputscanner.InputScanner;

public class ReplaceStringTemplate 
{
	public static void main(String[] args) 
	{
		String str="Hello <<username>>, How are you?";
		String r=replace(str);
		System.out.println(r);
	}
	private static String replace(String str) 
	{
		System.out.println("Enter the name");
		String name=InputScanner.inputWord();
		if(name.length()<3)
		{
			System.out.println("Username should contain minimum 3 characters");
			return "";
		}
		return str.replace("<<username>>", name);
	}

}
