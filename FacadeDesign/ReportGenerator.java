package com.DesignPattern.FacadeDesign;

import javax.activation.DataSource;

public class ReportGenerator {
	public void generateReport(ReportType type, DataSource dataSource, String location)
	{
		if (type == null || dataSource == null) 
		{

		}
		// create report
		Report report = new Report();
		report.setReportHeader(new ReportHeader());
		report.setReportFooter(new ReportFooter());
		report.setReportData(new ReportData());

		// write data
		ReportWriter writer = new ReportWriter();
		switch (type) 
		{
		case html:
			writer.writeHtmlReport(report, location);
			break;
		case pdf:
			writer.writePdfReport(report, location);
			break;

		}
	}
}


