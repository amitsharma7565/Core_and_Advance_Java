package com.DAO;
import java.sql.*;

public class DamoImpl {
	Connection con=null;
	public DamoImpl(){
//		1.Register drive 
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			2. get connection 
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con!=null) {
			System.out.println("Connected Successfully");
		}
	}
//	insert the data function 
	public void insert()throws SQLException{
////		3 create statement
		PreparedStatement pstmt=con.prepareStatement("insert into Demo values(?,?,?)");
		pstmt.setInt(1,102);
		pstmt.setString(2,"Vinay");
		pstmt.setString(3,"Veenu@123");
		
//	
		int i=pstmt.executeUpdate();
		if(i>=1) {
			System.out.println("data Inserted succesfully");
		}
	}
	
//	for update 
	public void update() throws SQLException {
			Statement st=con.createStatement();
		
		int i= st.executeUpdate("update Demo set name='"+"amit"+"' where id= '"+104+"'");
		if(i>=1) {
			System.out.println("updated");
		}
		
	}
	
//	delete oppertion 
	public void delete() throws SQLException {
		Statement st1=con.createStatement();
		int i= st1.executeUpdate("delete from Demo where id= '"+104+"'");
		if(i>=1) {
			System.out.println("data delete sucessfully");
		}
	}

//	display all data
	public void display() throws SQLException {
		Statement st2= con.createStatement();
//		ExecuteQuery
		ResultSet rs= st2.executeQuery("select*from Demo");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	
}
