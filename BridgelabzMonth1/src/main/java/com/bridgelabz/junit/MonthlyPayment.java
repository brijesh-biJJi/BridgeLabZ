package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;

public class MonthlyPayment 
{
static double P,Y,R,n,r,payment;
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Principle Amt, Year and Rate of Interest");
		P=InputScanner.inputDouble();
		Y=InputScanner.inputDouble();
		R=InputScanner.inputDouble();
		n=12*Y;
		r=R/(12*100);
		
		payment=calculateMonthlyPay(P,Y,R);
		System.out.println(payment);
	}
	
	public static double calculateMonthlyPay(double p,double y,double r)
	{
		n=12*Y;
		r=R/(12*100);
		payment=(P*r)/(1- Math.pow((1+r), -n));
		return payment;
	}

}
