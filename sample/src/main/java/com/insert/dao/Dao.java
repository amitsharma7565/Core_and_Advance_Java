package com.insert.dao;

import com.sample.sample.Student;

public interface Dao {
	public void insert(Student s);
	public void viewAllStudent();
	public void getById(int id);
	public void getByName(String name);
	public void updatByMarks(int id);
	public void deleteStudent(int id);
}
