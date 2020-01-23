package com.bridgelabz.BehavioralDesignPatterns.VisitorPattern;

public interface Visitable {
	/**
	 *  Allows the Visitor to pass the object so the right operations occur on the right type of object.
	 * @param visitor
	 * @return
	 */
	
	     
	
	 /**
	  * accept() is passed the same visitor object but then the method visit() is called using the visitor object. 
	  * The right version of visit() is called because of method overloading
	  * @param visitor
	  * @return
	  */

	public double accept(Visitor visitor);
}
