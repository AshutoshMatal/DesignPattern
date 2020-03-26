package com.DesignPattern.visitor;

public class Fruit 
{
	private int pricePerKg;
	private int weight;
	private String name;

	public Fruit(int price, int weight, String name) 
	{
		super();
		this.pricePerKg = price;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg()
	{
		return pricePerKg;
	}

	public int getWeight() 
	{
		return weight;
	}

	public String getName()
	{
		return name;
	}

}