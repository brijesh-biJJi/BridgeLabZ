package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public interface Visitor {
	/**
	 * Created to automatically use the right code based on the Object sent
	 * @param tobaccoItem
	 * @return
	 */
	public double visit(Liquor liquorItem);
	public double visit(Tobacco tobaccoItem);
}
