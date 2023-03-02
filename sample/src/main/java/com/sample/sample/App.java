package com.sample.sample;

import com.insert.dao.Dao;
import com.insert.dao.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s= new Student();
    	s.setName("Amit");
    	s.setMarks(100);
      Dao d1= new DaoImpl();
//      d1.insert(s);
//      d1.viewAllStudent();
//      d1.getById(3);
//      d1.getByName("Amit");
//      d1.updatByMarks(3);
      d1.deleteStudent(3);
    }
}
