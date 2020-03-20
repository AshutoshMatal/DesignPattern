package com.DesignPattern.Singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable 
{
	private static final long serialVersionUID = 7061979901052871783L;
	private SerializationSingleton() 
	{

	}
	private static class SingletonHelper 
	{
		private static SerializationSingleton instance = new SerializationSingleton();

	}
	public static SerializationSingleton getInstance() 
	{
		return SingletonHelper.instance;
	}
}


