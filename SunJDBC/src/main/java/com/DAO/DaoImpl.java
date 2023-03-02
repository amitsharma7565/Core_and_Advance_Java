package com.DAO;

import java.sql.*;

public class DaoImpl {
	Connection con=null; 
//	make constructor
public DaoImpl() {
//   1 Register Driver
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sun","root","root");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(con!=null) {
		System.out.println("Connected SucessFully");
	}
	else {
		System.out.println("Not Connected please try again");
	}
	
	
	}
// insert the data
public void insert() throws SQLException {
	PreparedStatement pstmt= con.prepareStatement("insert into emp values(?,?,?)");
	pstmt.setInt(1, 102);
	pstmt.setString(2, "Sharma");
	pstmt.setInt(3, 26);
	
	int i= pstmt.executeUpdate();
	if(i>=1){
		System.out.println("Data inserted Succesfully");
	}
	else {
		System.out.println("Data not inserted Successfully");
	}
}
// updata the data
public void update() throws SQLException {
	Statement st= con.createStatement();
	int i=st.executeUpdate("update emp set name='"+"Vishal"+"' where id='"+102+"'");
	if(i>=1) {
		System.out.println("Data Updated");
		
	}
	else {
		System.out.println("Data not upate pleae try again");
	}
}

//delete the data

public void delete() throws SQLException {
	Statement st= con.createStatement();
	int i=st.executeUpdate("delete from emp where id ='"+102+"'");
	if(i>=1) {
		System.out.println("Data deleted sucessFully");
	}
	else {
		System.out.println("Data not delete please try again");
	}
}

//Display the data

public void displayAll() throws SQLException {
	Statement st= con.createStatement();
ResultSet rs=st.executeQuery("select*from emp");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
}
}
