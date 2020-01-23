package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

/**
 * Concrete Visitor Class

 * @author user
 *
 */
public class TaxVisitor implements Visitor{

	/**
	 * Calculates total price based on this being taxed as a liquor item
	 */
	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor Item: Price with Tax");
		return ((liquorItem.getPrice() * .18) + liquorItem.getPrice());
	}

	/**
	 * Calculates total price based on this being taxed as a tobacco item
	 */
	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco Item: Price with Tax");
		return ((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice());
	}
}
