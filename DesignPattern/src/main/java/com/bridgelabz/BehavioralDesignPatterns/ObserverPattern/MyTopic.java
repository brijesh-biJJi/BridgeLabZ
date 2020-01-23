package com.bridgelabz.BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject 
{
	private String name;
	private List<Observer> observers=null;
	private String message;
	private boolean changed;
	private static final Object Mutex=new Object();
	
	
	/**
	 * Creating ArrayList Object
	 * @param observers
	 */
	public MyTopic() {
		observers=new ArrayList<>();
	}

	@Override
	public void register(Observer obj) 
	{
		if(obj==null)
			throw new NullPointerException("Null Observer");
		synchronized (Mutex) {
			if(!observers.contains(obj))
				observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		synchronized (Mutex) {
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> localObserver;
		synchronized (Mutex) {
			if(!changed)
				return;
			localObserver=new ArrayList<Observer>(this.observers);
			this.changed=false;
		}
		for (Observer observer : localObserver) {
			observer.update();
		}
	}

	/**
	 * Returns the message
	 */
	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	/**
	 * Method to post message to the topic
	 */
	public void postMessage(String msg)
	{
		//System.out.println("Message Posted to "+name+" :: "+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
	
}
