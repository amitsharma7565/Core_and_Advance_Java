package com.bitLabs.hibernateProduct;

import java.util.Scanner;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	Scanner sc = new Scanner(System.in);
        StudentDao stu= new StudentDaoImpl();
        int option;
        do {
        	System.out.println("Enter 1 for insert the data");
        	System.out.println("Enter 2 for marksByDescOrder");
        	System.out.println("Enter 3 for marksBetween");
        	System.out.println("Enter 4 for Student High Grade");
        	System.out.println("Enter 5 for Student Low Grade");
        	System.out.println("Enter 6 for displayCityWise");
        	System.out.println("Enter 0 for Exit");
        	 option = sc.nextInt();
        	
        	switch(option) {
        	case 1:
        		stu.inserData();
        		break;
        	case 2:
        		stu.marksByDesc();
        		break;
        	case 3:
        		stu.marksBetween();;
        		break;
        	case 4:
        		stu.displayGradeHigh();
        		break;
        	case 5:
        		stu.displayGradeLow();
        		 break;
        	case 6:
        		stu.displayCityWise();
        		break;
        	}
        }while(option!=0);
        
        
        
        

    }
}
