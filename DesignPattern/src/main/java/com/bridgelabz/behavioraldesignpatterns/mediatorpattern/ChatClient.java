package com.bridgelabz.behavioraldesignpatterns.mediatorpattern;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator chatMediator=new ChatMediatorImpl();
		User user1=new UserImpl(chatMediator, "Brijesh");
		User user2=new UserImpl(chatMediator, "Baijith");
		User user3=new UserImpl(chatMediator, "Srijan");
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		
		user1.send("Hi hello..!");
		System.out.println();
		user3.send("Yencha ulla..!");
	}

}
