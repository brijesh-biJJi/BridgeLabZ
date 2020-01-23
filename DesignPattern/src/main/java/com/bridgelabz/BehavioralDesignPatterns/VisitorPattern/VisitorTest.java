package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public class VisitorTest {
	public static void main(String[] args) {
		TaxVisitor taxCalc=new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc=new TaxHolidayVisitor();
		
		Liquor liquor=new Liquor(11.99);
		Tobacco tobacco=new  Tobacco(19.99);
		
		System.out.println(liquor.accept(taxCalc)+ "\n");
		System.out.println(tobacco.accept(taxCalc));
		
		System.out.println("\nTAX HOLIDAY PRICES :");
		System.out.println("-------------------");


		System.out.println(liquor.accept(taxHolidayCalc)+ "\n");
		System.out.println(tobacco.accept(taxHolidayCalc));
	}
}
