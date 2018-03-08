package com.sunyalbany.onlineexam.DBConnection;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;

	public static Connection getconnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam", "root", "root");
		} catch (Exception e) {
			System.out.println("Database Error" + e);
		}
		return con;
	}

}
