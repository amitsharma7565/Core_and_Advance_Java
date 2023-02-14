package com.bitlabs.Hibernate_CRUD_Opertions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Dao.TharabahaiDao;
import com.bitlabs.Dao.TharabahiDaoInterface;
import com.bitlabs.Entity.TharabhaiBatch;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        TharabahiDaoInterface dao=new TharabahaiDao();
        int option=0;
        
        do {
        	System.out.println("Enter 1 to insert student data ");
        	System.out.println("Enter 2 to get all student data ");
        	System.out.println("Enter 3 to update student data ");
        	System.out.println("Enter 4 to get  student by id  ");
        	System.out.println("Enter 5 to delete student by id ");
        	System.out.println("Enter 0 to exit ");
        	option=sc.nextInt();
        	
        	switch(option) {
        	case 1:
        		dao.insert();
        		break;
        	case 2:
        		dao.getAllStudent();
        		break;
        	case 3:
        		dao.updateById(11);
        		break;
        	case 4:
        		dao.getStudentById(11);
        		break;
        	case 5:
        		dao.deleteStudentById(11);
        		break;
        	}
        	
        }while(option!=0);
         // dao.insert();
        //dao.getAllStudent();
        //dao.updateById(11);
        //dao.getStudentById(11);
        //dao.deleteStudentById(11);
    }
}
