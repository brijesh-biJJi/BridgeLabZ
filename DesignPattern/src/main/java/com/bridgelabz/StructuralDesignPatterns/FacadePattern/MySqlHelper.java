package com.bridgelabz.StructuralDesignPatterns.FacadePattern;

import java.sql.Connection;

public class MySqlHelper 
{
	/**
	 * Get MySql DB connection using connection parameters
	 * @return
	 */
	public static Connection getMySqlDBConnection()
	{
		System.out.println("Connection Successfull");
		return null;
	}
	
	/**
	 * Get data from table and generate pdf report
	 * @param tableName
	 * @param con
	 */
	public void generateMySqlPDFReport(String tableName, Connection con)
	{
		System.out.println("MySql PDF Report Generated....");
	}
	
	/**
	 * Get data from table and generate Html report
	 * @param tableName
	 * @param con
	 */
	public void generateMySqlHTMLReport(String tableName, Connection con)
	{
		System.out.println("MySql HTML Report Generated...");
	} 
	
	
}
