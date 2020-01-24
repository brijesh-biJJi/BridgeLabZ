package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;
import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
		double tf;
		double tc;
		System.out.println("Enter the Temperature in Fahrenheit: ");
		tf=InputScanner.inputDouble();
		System.out.println("Celsius : "+Utility.fahrenToCelsius(tf));
		
		
		System.out.println("Enter the Temperature in Celsius: ");
		tc=InputScanner.inputDouble();
		System.out.println("Fahrenheit : "+Utility.celsiusToFahren(tc));
	}

}
