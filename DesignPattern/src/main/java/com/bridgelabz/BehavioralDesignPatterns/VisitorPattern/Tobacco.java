package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public class Tobacco implements Visitable {

	private double price;
	
	Tobacco(double item){
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
