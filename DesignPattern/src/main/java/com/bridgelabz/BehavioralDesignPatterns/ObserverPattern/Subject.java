package com.bridgelabz.BehavioralDesignPatterns.ObserverPattern;

public interface Subject 
{
	/**
	 * methods to register and unregister observers
	 * @param obj
	 */
	public void register(Observer obj);
	public void unregister(Observer obj);
		
	/**
	 * method to notify observers of change
	 */
		public void notifyObservers();
		
	/**
	 * method to get updates from subject
	 * @param obj
	 * @return
	 */
	public Object getUpdate(Observer obj);
}
