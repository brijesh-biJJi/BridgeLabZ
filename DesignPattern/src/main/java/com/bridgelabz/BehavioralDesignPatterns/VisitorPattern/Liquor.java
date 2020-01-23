package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public class Liquor implements Visitable {

	private double price;
	
	Liquor(double item){
		this.price=item;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
