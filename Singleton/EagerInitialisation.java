package com.DesignPattern.Singleton;

public class EagerInitialisation 
{
	private static EagerInitialisation instance = new EagerInitialisation();
	private EagerInitialisation()
	{

	}
	public static EagerInitialisation getInstance()
	{
		return instance ;
	}
	public void show() 
	{
		System.out.println("Show EagerInitialization singleton design pattern ");
	}
}


