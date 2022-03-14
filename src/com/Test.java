package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE","system","password");
		
				System.out.println(con.getTransactionIsolation());//2
				
				con.setTransactionIsolation(8);
				
				System.out.println(con.getTransactionIsolation());

	}

}
