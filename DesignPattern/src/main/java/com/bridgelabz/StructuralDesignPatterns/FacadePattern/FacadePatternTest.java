package com.bridgelabz.StructuralDesignPatterns.FacadePattern;

import java.sql.Connection;

import com.bridgelabz.StructuralDesignPatterns.FacadePattern.HelperFacade.*;

public class FacadePatternTest {

	public static void main(String[] args) 
	{
		String tableName="Employee";
		
		/**
		 * Generating MySql HTML report and Oracle PDF report without using Facade
		 */
		System.out.println("Generating MySql HTML report and Oracle PDF report without using Facade");
		/**
		 * Get Mysql DB Connection
		 */
		Connection conM=MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper=new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, conM);
		
		/**
		 * Get Oracle DB Connection
		 */
		Connection conO=OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper=new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, conO);
		
		

		/**
		 * Generating MySql HTML report and Oracle PDF report using Facade
		 */
		System.out.println("\nGenerating MySql HTML report and Oracle PDF report using Facade\n");
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,HelperFacade.ReportTypes.PDF, tableName);
	}

}
