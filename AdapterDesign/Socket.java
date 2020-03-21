package com.DesignPattern.AdapterDesign;

public class Socket 
{
	public Volt getVolt() 
	{
		return new Volt(120);
	}

}
