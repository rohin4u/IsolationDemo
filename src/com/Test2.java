package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/jdbcdemo?useSSL=false&serverTimezone=UTC","root","root");
		
				System.out.println(con.getTransactionIsolation());//2
				
				con.setTransactionIsolation(8);
				
				System.out.println(con.getTransactionIsolation());

	}

}
