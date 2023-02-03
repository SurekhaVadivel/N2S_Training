package com.n2s.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtSample {
	public static Connection con = null;
	public static PreparedStatement pstmt = null;
	public static String query = "insert into login values (?, ?, ?)";
	public static ResultSet rs = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@//10.0.0.168:1521/xe", "SYS as sysdba", "SYS");
			System.out.println("Database is connected");
			pstmt = con.prepareStatement(query);
			
			for (int i =0; i <3; i++)
			{
				pstmt.setInt(1,i+5);
				pstmt.setString(2, "Test"+i);
				pstmt.setString(3, "test"+i);
				
				pstmt.executeUpdate();
			}
		}
		catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
