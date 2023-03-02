package com.bitLabs.ProductInfo;
import java.sql.*;

public class DaoImpls1 implements Doa1 {
	Connection con=null;
	DaoImpls1(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","root");
			if(con!=null) {
				System.out.println("connected");
			}
			else {
				System.out.println("not connected");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void insert(ProductInfo pi) {
		try {
			PreparedStatement pstmt= con.prepareStatement("insert into productinfo (Product_name, Price) values(?,?)");
			pstmt.setString(1, pi.getProduct_name());
			pstmt.setInt(2,pi.getPrice());
			int rs =pstmt.executeUpdate();
			if(rs>0) {
				System.out.println(" inserted");
			}
			else {
				System.out.println("not inserted");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
}

}
