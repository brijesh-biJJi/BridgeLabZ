package com.bridgelabz.behavioraldesignpatterns.mediatorpattern;

public class UserImpl extends User {

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+" Sending Message : "+msg);
		chatMediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+" Received Message : "+msg);
	}

}
