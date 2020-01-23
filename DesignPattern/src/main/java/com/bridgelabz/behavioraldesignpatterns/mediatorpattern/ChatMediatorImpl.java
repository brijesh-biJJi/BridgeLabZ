package com.bridgelabz.behavioraldesignpatterns.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

	private List<User> users;
	
	
	public ChatMediatorImpl() {
		super();
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User u : users) {
			/**
			 * Message should not be received by the user sending it
			 */
			if(u !=user)
				u.receive(msg);
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
