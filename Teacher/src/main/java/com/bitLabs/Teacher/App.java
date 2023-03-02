package com.bitLabs.Teacher;

import com.DAO.TeacherDao;
import com.DAO.TeacherImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TeacherDao td= new TeacherImpl();
//        td.insert();
//        td.updateTeacherById(101);
//        td.deleteById(101);
        td.getAllTeacher();
    }
}
