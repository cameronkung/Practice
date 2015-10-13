package com.liferay4u;
import java.sql.Connection;
import java.sql.DriverManager;


public class dbConnector {

	String url = "jdbc:mysql://gll.eil-server.cba.ua.edu/gll_db"; //"test" = name of database
	String driver = "com.mysql.jdbc.Driver";
	String username = "msalmon14";
	String password = "GLLAllstars2015";
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

