package com.diworksdev.login.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/logindb_komoto";
	private static String user = "root";
	private static String password = "";

	public Connection getConnection() {
		connectiion con = null;

		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	return con;
	}
}
