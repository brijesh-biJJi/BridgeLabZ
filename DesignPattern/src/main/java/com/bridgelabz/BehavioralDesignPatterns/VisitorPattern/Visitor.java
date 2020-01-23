package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public interface Visitor {
	public void visit(Liquor liquorItem);
	public void visit(Tobacco liquorItem);
}
