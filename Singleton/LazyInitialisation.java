package com.DesignPattern.Singleton;

public class LazyInitialisation 
{
	private static LazyInitialisation instance;
	private LazyInitialisation() 
	{

	}
	public static LazyInitialisation getInstance()
	{
		if(instance == null) 
		{
			instance = new LazyInitialisation();
		}
		return instance;
	}
	public void show()
	{
		System.out.println("Show LazyInitialization singleton design pattern ");
	}


}


