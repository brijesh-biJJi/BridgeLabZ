package com.bridgelabz.junit;

import com.bridgelabz.inputscanner.InputScanner;

public class MonthlyPayment 
{
static double P;
static double Y;
static double R;
static double n;
static double r;
static double payment;
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Principle Amt, Year and Rate of Interest");
		P=InputScanner.inputDouble();
		Y=InputScanner.inputDouble();
		R=InputScanner.inputDouble();
		
		payment=calculateMonthlyPay(P,Y,R);
		System.out.println(payment);
	}
	
	public static double calculateMonthlyPay(double P,double Y,double R)
	{
		n=12*Y;
		r=R/(12*100);
		payment=(P*r)/(1- Math.pow((1+r), -n));
		return payment;
	}

}
