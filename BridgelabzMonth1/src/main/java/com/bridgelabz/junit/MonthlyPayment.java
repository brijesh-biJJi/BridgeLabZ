package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		double P,Y,R,n,r,payment;
		System.out.println("Enter the Principle Amt, Year and Rate of Interest");
		P=InputScanner.inputDouble();
		Y=InputScanner.inputDouble();
		R=InputScanner.inputDouble();
		n=12*Y;
		r=R/(12*100);
		
		payment=(P*r)/(1- Math.pow((1+r), -n));
		System.out.println(payment);
	}

}
