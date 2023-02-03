package com.n2s.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableSample {

	public static Connection con = null;
	public static CallableStatement cstmt = null;
	public static ResultSet rs = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@//10.0.0.168:1521/xe", "SYS as sysdba", "SYS");
			System.out.println("Database is connected");
			cstmt = con.prepareCall("{call insertlogin(?,?,?)}");
			cstmt.setInt(1, 8);
			cstmt.setString(2, "Ammu");
			cstmt.setString(3, "pwd2");
			cstmt.executeUpdate();
		}
		catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
