package com.bridgelabz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/bij";
	String uuser="bijji";
	String upass="thedoctor46";
	
	String qry="select * from log where username=? and password=?";
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	public boolean check(String uname,String pass)
	{
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,uuser,upass);
			pstmt=con.prepareStatement(qry);
			
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
			rs=pstmt.executeQuery();
			if(rs.next())
				return true;
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
