package com.DesignPattern.Mediator;

public class ChatClient {
	public static void main(String[] args) 
	{
		ChatMediator chat = new ChatMediatorImpl();
		User user2 = new UserImpl(chat, "Steady");
		User user3 = new UserImpl(chat, "Riya");
		User user4 = new UserImpl(chat, "maya");
		User user5 = new UserImpl(chat, "mani");
		chat.addUser(user2);
		chat.addUser(user3);
		chat.addUser(user4);
		chat.addUser(user5);
		user5.send("Hi All...");
	}	

}


