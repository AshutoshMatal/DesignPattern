package com.DesignPattern.Factory;

public class FactoryTest {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB","2.5 GHz");
		System.out.println("PC Config "+pc);

	}

}
