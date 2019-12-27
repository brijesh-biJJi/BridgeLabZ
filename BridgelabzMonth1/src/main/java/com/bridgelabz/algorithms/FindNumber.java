package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class FindNumber {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number....");
		int t=InputScanner.inputInteger();
		int n=(int) Math.pow(2, t);
		System.out.println("Guess the number between 0 to "+n);
		int gs=Utility.binarySearch(0,n);
		System.out.println("The Number is : "+gs);
	}
}
