package com.hospital;

public interface DaoInterface {
	public void patientRegistration(PatientInfo p);
	public void viewAllPatient();
	public void searchPatientById(int id);
	public void deletePatientById(int id);
	public void searchPatientByCity(String city);
	public void searchPatientByAgeGroup(int start,int end);
	public void markPatientRecoveryById(int id);
}
