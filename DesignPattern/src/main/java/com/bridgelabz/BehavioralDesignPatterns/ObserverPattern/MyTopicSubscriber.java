package com.bridgelabz.BehavioralDesignPatterns.ObserverPattern;

public class MyTopicSubscriber implements Observer
{
	private String name;
	private Subject topic;

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
		String msg=(String) topic.getUpdate(this);
		if(msg==null)
			System.out.println(name+":: NO New Message..");
		else
			System.out.println(name+":: Consuming Message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}
	
	
}
