package com.insert.dao;

import java.sql.*;

import com.sample.sample.Student;

public class DaoImpl implements Dao{
	Connection con=null;
	public DaoImpl(){
		try {
//			register
			Class.forName("com.mysql.jdbc.Driver");
//			connection 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
			if(con!=null) {
				System.out.println("conected");
			}
			else {
				System.out.println("not connected");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void insert(Student s) {
		try {
			PreparedStatement pstmt= con.prepareStatement("insert into student (name,marks) values(?,?)");

			pstmt.setString(1,s.getName());
			pstmt.setInt(2, s.getMarks());
			int i=pstmt.executeUpdate();
			if(i>0) {
				System.out.println("inserted");
				
			}
			else {
				System.out.println("not inserted");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
	}
	
	public void viewAllStudent() {
		try {
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery("select*from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getById(int id) {
		try {
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery("select*from student where id ='"+id+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getByName(String name) {
		try {
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery("select*from student where name ='"+name+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void updatByMarks(int id) {
		try {
			Statement st= con.createStatement();
			int i=st.executeUpdate("update student set marks =500 where id='"+id+"'");
			if(i>0) {
				
				System.out.println("updated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void deleteStudent(int id) {
		try {
			Statement st= con.createStatement();
			int i=st.executeUpdate("delete from student where id='"+id+"'");
			if(i>0) {
				System.out.println("deleted");
			}
			else {
				System.out.println("not deleted");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
