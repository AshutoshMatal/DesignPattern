package com.DesignPattern.ProxyDesign;

import java.io.IOException;

public class CommondExecutorImpl implements CommondExecutor 
{

	@Override
	public void runCommand(String command) throws IOException 
	{
		Runtime.getRuntime().exec(command);
		System.out.println("Commands "+command);

	}

}