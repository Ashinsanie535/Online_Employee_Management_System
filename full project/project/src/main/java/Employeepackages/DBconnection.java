package Employeepackages;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	
	
private static String url = "jdbc:mysql://127.0.0.1:3306/database";
private static String username = "root";
private static String password = "123456";
	
private static  Connection con;


public static Connection getConnection () {
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection( url,username,password );
		
	} catch (Exception e) {
		System.out.println("database connection error");
	}
	return con;
	
}

	
	
}
