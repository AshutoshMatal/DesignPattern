package com.DesignPattern.PrototypeDesign;

import java.util.List;

public class PrototypeTest
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employees employee = new Employees();
		employee.loadData();
		Employees emp = employee.clone();
		Employees emps = employee.clone();
		List<String> list = emp.getEmpList();
		list.add("virat");
		System.out.println("emp " + list);
	}
}
