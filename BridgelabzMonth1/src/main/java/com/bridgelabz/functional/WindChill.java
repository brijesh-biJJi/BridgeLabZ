package com.bridgelabz.functional;

import com.bridgelabz.inputscanner.InputScanner;

public class WindChill 
{
	public static void main(String[] args) 
	{
		double t;
		double v;
		double wc;
		System.out.println("Enter the Temperature in Farenheit and Wind Speed");
		t=InputScanner.inputDouble();
		v=InputScanner.inputDouble();
		System.out.println("Temperature in Farenheit: "+t);
		System.out.println("Wind Speed : "+v);
		
		if(t < 50 || v<120 && v>3)
		{
			wc = (35.74) + (0.6215*t) + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind Chill : "+wc);
		}
		else
			System.out.println("Temperature must be less than 50 and Speed must be within 3 and 120");
	}
}
