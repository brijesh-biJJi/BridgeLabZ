package com.bridgelabz.BehavioralDesignPatterns.ObserverPattern;

public class MyTopicSubscriber implements Observer
{
	private String name;

	/**
	 * Initializes the Observer
	 * @param name
	 */
	public MyTopicSubscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub
		
	}
	
	
}
