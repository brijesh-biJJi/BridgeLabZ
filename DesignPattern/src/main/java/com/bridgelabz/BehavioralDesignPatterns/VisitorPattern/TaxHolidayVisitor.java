package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public class TaxHolidayVisitor implements Visitor{

	/**
	 * Calculates total price based on this being taxed as a liquor item
	 */
	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor Item: Price with Tax");
		return ((liquorItem.getPrice() * .10) + liquorItem.getPrice());
	}

	/**
	 * Calculates total price based on this being taxed as a tobacco item
	 */
	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco Item: Price with Tax");
		return ((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice());
	}
}
