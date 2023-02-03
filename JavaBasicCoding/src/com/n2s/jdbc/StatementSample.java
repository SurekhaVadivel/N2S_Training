package com.n2s.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementSample {

	public static Connection con = null;
	public static Statement stmt = null;
	public static ResultSet rs = null;
	public static void main(String[] args) {
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@//10.0.0.168:1521/xe", "SYS as sysdba", "SYS");
			System.out.println("Database is connected");
			stmt = con.createStatement();
			
			//String sql = "insert into login values (4, 'surya', 'pwd1')";
			//int result = stmt.executeUpdate(sql);
			//System.out.println(result);
			
			String sql = "select * from login";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				//System.out.println(rs.getInt("id")+" "+rs.getString("uname")+" "+rs.getString("password"));
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			//Prepared will have pre-compiled sql query
			//it will compile only once.
			//we will use again and again
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
