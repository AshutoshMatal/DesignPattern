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
		//ADDING THE ELEMENTS 
		list.add("virat");
		List<String> list1 = emps.getEmpList();
		//REMOVING THE ELEMENTS
		list1.remove("akash");
		System.out.println("employee List " + employee.getEmpList());
		System.out.println("emp " + list);
		System.out.println("emps " + list1);
	}
}
