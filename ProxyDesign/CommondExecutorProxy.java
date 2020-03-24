package com.DesignPattern.ProxyDesign;

import java.io.IOException;

public class CommondExecutorProxy implements CommondExecutor
{

	private boolean isAdmin;

	public  CommondExecutorProxy(String user , String password) 
	{
		if(user.equals("Admin") && (password.equals("admin")))
		{
			isAdmin = true;
		}	
	}
	@Override
	public void runCommand(String command) throws IOException
	{
		CommondExecutorImpl executorImpl = new CommondExecutorImpl();
		if (isAdmin) 
		{
			executorImpl.runCommand(command);

		}
		else 
		{
			if(command.trim().startsWith("rm"))
			{
				System.out.println("non-admin user not use rm command ");
			}
			else
				executorImpl.runCommand(command);
		}

	}

}