package com.DesignPattern.Factory;

public class FactoryTest {

	public static void main(String[] args)
	{
		//PC CONFIG
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB","2.5 GHz");
		System.out.println("PC Config "+pc);
		//SERVER CONFIG
		Computer server = ComputerFactory.getComputer("server", "32 GB" ,"2 TB", "2.9 GHz");
		System.out.println("Server Config "+server);
	}
}
