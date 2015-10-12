package com.liferay4u;
import java.sql.Connection;
import java.sql.DriverManager;


public class dbConnector {

	String url = "jdbc:mysql://localhost/test"; //"test" = name of database
	String driver = "com.mysql.jdbc.Driver";
	String username = "root";
	String password = "";
	Connection conn;
	
	
	public dbConnector() {
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

