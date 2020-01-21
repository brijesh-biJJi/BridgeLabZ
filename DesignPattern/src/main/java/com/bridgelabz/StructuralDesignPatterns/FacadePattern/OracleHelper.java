package com.bridgelabz.StructuralDesignPatterns.FacadePattern;

import java.sql.Connection;

public class OracleHelper
{
	/**
	 * Get Oracle DB connection using connection parameters
	 * @return
	 */
	public static Connection getOracleDBConnection()
	{
		System.out.println("Connection Successfull");
		return null;
	}
	
	/**
	 * Get data from table and generate pdf report
	 * @param tableName
	 * @param con
	 */
	public void generateOraclePDFReport(String tableName, Connection con)
	{
		System.out.println("Oracle PDF Report is Generated");
	}
	
	/**
	 * Get data from table and generate Html report
	 * @param tableName
	 * @param con
	 */
	public void generateOracleHTMLReport(String tableName, Connection con)
	{
		System.out.println("Oracle HTML Report is Generated");
	} 
}
