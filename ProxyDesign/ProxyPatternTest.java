package com.DesignPattern.ProxyDesign;

import java.io.IOException;

public class ProxyPatternTest {
	public static void main(String[] args) throws IOException {
		CommondExecutor execute = new CommondExecutorProxy("Admin", "password");
		try {
			execute.runCommand("ls");
			execute.runCommand("ls -ltr");
			execute.runCommand(" rm -rf abc.pdf");
		}
		catch(Exception e)
		{
			System.out.println("Exception message :"+e.getMessage());
		}

	}
}