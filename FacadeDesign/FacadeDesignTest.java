package com.DesignPattern.FacadeDesign;

public class FacadeDesignTest {
	public static void main(String[] args) {
		ReportGenerator generate = new ReportGenerator();
		generate.generateReport(ReportType.html, null, null);
		System.out.println();
		generate.generateReport(ReportType.pdf, null, null);
	}

}


