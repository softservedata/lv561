package com.softserve.edu.Project.MyWindow;

import java.sql.SQLException;
import java.sql.DriverManager;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerConnection;

public class DbConnection {

	private Connection connection = null;
	private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String instanceName = "lacalhost\\SQLEXPRESS";
	private final String dbName = "DbPerson";
	private final String password = "root";
	private final String userName = "admin";

	public Connection getConnection() {
		return connection;
	}

	

	public void Connect(String login, String password) {

		String connectionUrl = "jdbc:sqlserver://%1$s;databaseName=%2$s;user=%3$s;password=%4$s;";
		// "jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=DbPerson"
		String str = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=DbPerson";

		String connectionString = String.format(connectionUrl, instanceName, dbName, userName, password);
		try {
			System.out.println(str);

			connection = DriverManager.getConnection(str, login, password);
			System.out.println("  Ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage() + " \nNo Ok");
		}
	}

}
