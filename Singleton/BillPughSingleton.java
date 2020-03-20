package com.DesignPattern.Singleton;

public class BillPughSingleton 
{
	private static class SingletonHelper 
	{
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() 
	{
		return SingletonHelper.instance;

	}

}


 