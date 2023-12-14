package com.tns.jdbc;
import  java.io.*;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception
	{
		
		
		String url ="jdbc:mysql://localhost:3306/a18_mydb";
		String username = "root";
		String password ="root@password";
		
		String query ="select * from students";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		System.out.println( "connection is establioshed");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		
		//String name=
		
		con.close();
		st.close();
		
		System.out.println("connection closed....");
		
		
		
		



	}

}
