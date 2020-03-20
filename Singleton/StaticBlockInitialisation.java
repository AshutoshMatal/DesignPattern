package com.DesignPattern.Singleton;

public class StaticBlockInitialisation 
{
	private static StaticBlockInitialisation instance;

	private void StaticBlockInitialisation()
	{
	}
	//STATIC BLOCK 
	static {
		try
		{
			instance = new StaticBlockInitialisation();
		} 
		catch (Exception e) 
		{
			throw new RuntimeException("Error");
		}

	}
	public static StaticBlockInitialisation getInstance()
	{
		return instance;
	}
	public void show() 
	{
		System.out.println("Show Static Block singleton design pattern ");
	}

}


