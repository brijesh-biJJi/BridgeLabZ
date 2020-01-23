package com.bridgelabz.behavioraldesignpatterns.mediatorpattern;

public abstract class User {
	protected ChatMediator chatMediator;
	protected String name;
	
	public User(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}
	
	public abstract void send(String msg);
	public abstract void receive(String msg);
}
