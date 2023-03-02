package com.DAO;

import java.sql.*;

public class DaoImpl {
	Connection con=null;
public DaoImpl() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
