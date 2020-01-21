package com.bridgelabz.StructuralDesignPatterns.FacadePattern;

import java.sql.Connection;

public class FacadePatternTest {

	public static void main(String[] args) 
	{
		String tableName="Employee";
		
		/**
		 * Get Mysql DB Connection
		 */
		Connection conM=MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper=new MySqlHelper();
		mySqlHelper.generateMySqlPDFReport(tableName, conM);
		
		/**
		 * Get Oracle DB Connection
		 */
		Connection conO=OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper=new OracleHelper();
		oracleHelper.generateOracleHTMLReport(tableName, conO);
		
	}

}
