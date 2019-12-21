package com.bridgelabz.functional;

import com.bridgelabz.inputscanner.InputScanner;

public class Quadratic 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value for A, B & C ");
		double a,b,c,root1,root2;
		a=InputScanner.inputDouble();
		b=InputScanner.inputDouble();
		c=InputScanner.inputDouble();
		double delta=(b*b)-4*a*c;
		System.out.println(delta);
		if(delta>0)
		{
			root1=((-b) - (sqrt(delta))) / (2*a);
			root2=((-b) + (sqrt(delta))) / (2*a);
			System.out.println("Root1 = "+root1+" Root2 = "+root2);
		}
		else if(delta==0)
		{
			double root=-b/(2*a);
			System.out.println(root);
		}
		else
			System.out.println("No root...");
	}

	private static double sqrt(double d) 
	{
		double temp,sq;
		sq=d/2.0;
		do
		{
			temp=sq;
			sq=(temp+(d/temp))/2;
		}while(temp-sq!=0);
		return sq;
	}
}
