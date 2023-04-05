package com.jdbc.demo;
import java.sql.*;
public class DaoImpl {
	public static Connection con=null;
//	create constructor 
	public DaoImpl() {
			try {
//				Step1: Register the Driver
				Class.forName("com.mysql.jdbc.Driver");
//				Step2:Create Connection
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root","root");
				
			} catch (Exception e) {
				System.out.println(e);
			}
			if(con==null) {
				System.out.println("Not connected");
			}
			else {
				System.out.println("its connected");
			}
	}
	
//	insert the data
	public  void insert() throws SQLException {
//		Statement st= con.createStatement();
//		  String query = "CREATE TABLE CUSTOMERS("+ "ID INT PRIMARY KEY, " + "NAME VARCHAR (20), " + "AGE INT, " + "ADDRESS CHAR (25))";
//		boolean perfrom= st.execute(query);
//		  if(perfrom) {
//			  System.out.println("Table created");
//		  }
//		  else {
//			  System.out.println("Table not created");
//		  }
//		Rename the table;
//		String query= "RENAME TABLE gymPerson TO gymPersons";
//		boolean perfromAction= st.execute(query);
//		
//		if(perfromAction) {
//			System.out.println("Table rename");
//		}
//		else {
//			System.out.println("Table not rename");
//		}
		
//		insert the values in the table
		
	PreparedStatement pt=con.prepareStatement("insert into gymPersons values(?,?,?,?)");
		pt.setInt(1, 103);
		pt.setString(2,"Dogra");
		pt.setInt(3,23);
		pt.setString(4, "bdeg");
		
		 int i=pt.executeUpdate();
		 
		 if(i>=1) {
			 System.out.println("Data inserted successfully");
		 }
		 else {
			 System.out.println("Data not inserted");
		 }
	}
	
//	for update something the table;
	public void update() throws SQLException{
		Statement st= con.createStatement();
		int i= st.executeUpdate("update gympersons set name= '"+"Subhas"+"' where id= '"+102+"'");
		
		if(i>=1) {
			System.out.println("Data update sucessfully");
		}
		else {
			System.out.println("data not update please check again");
		}
	}
	
//	delete the data from the table
	public void delete() throws SQLException{
		Statement st= con.createStatement();
		int i=st.executeUpdate("delete from gympersons where id='"+104+"'");
		
		if(i>=1) {
			System.out.println("delete sucessFully");
			
		}
		else {
			System.out.println("not delete please check again");
		}
		
	}
	
public void displayAll() throws SQLException{
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery("select*from gympersons");
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(2));
	}
	con.close();
}
	
}
