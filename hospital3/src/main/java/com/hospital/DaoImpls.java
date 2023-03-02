package com.hospital;
import java.sql.*;
public class DaoImpls implements DaoInterface {
	Connection con=null;
	DaoImpls(){
//		register the driver 
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			get connection 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void patientRegistration(PatientInfo p) {
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into patientinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, null);
			pstmt.setString(2,p.getName());
			pstmt.setInt(3,p.getAge());
			pstmt.setString(4,p.getGender());
			pstmt.setLong(5,p.getAddhar_card());
			pstmt.setLong(6,p.getContact_number());
			pstmt.setString(7,p.getCity());
			pstmt.setString(8,p.getAddress());
			pstmt.setString(9,p.getDate_of_admission());
			pstmt.setString(10,p.getGuardian_name());
			pstmt.setString(11,p.getGuardian_address());
			pstmt.setLong(12, p.getGuardian_contact_number());
			pstmt.setString(13,p.getRecovery());
			
			int i= pstmt.executeUpdate();
			if(i>0) {
				System.out.println("Patient data inserted successfully");
			}
			else {
				System.out.println("not inserted please try again");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
//	Display all patient
	public void viewAllPatient() {
		try {
		Statement st=con.createStatement();
		ResultSet rs;
			rs = st.executeQuery("select*from patientinfo");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	search patient by id 
	public void searchPatientById(int id) {
		try {
		Statement st=con.createStatement();
		ResultSet rs;
		
			rs = st.executeQuery("select*from patientinfo where id='"+id+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	delete a patient by id
	public void deletePatientById(int id) {
		try {
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from patientinfo where id='"+id+"'");
			if(i>0) {
				System.out.println("patient data deleted sucessfully");
			}
			else {
				System.out.println("Not deleted please try again");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
//	search a patient based by city
	public void searchPatientByCity(String city) {
		try {
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select* from patientinfo where city= '"+city+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
//	search a patient by age group 
	public void searchPatientByAgeGroup(int start,int end) {
		try {
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select*from patientinfo where age between '"+start+"' and '"+end+"' ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getLong(5)+" "+rs.getLong(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
//	recovery status of patient based on id
	public void markPatientRecoveryById(int id) {
		try {
			Statement st= con.createStatement();
			int i= st.executeUpdate("update patientinfo set recover='"+"Recoverd"+"' where id= '"+id+"'");
			if(i>0) {
				System.out.println("patient has been recoverd successfully");
			}
			else {
				System.out.println("Recover status not change");
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}
}

	
