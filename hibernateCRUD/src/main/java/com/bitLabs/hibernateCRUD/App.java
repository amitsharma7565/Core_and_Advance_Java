package com.bitLabs.hibernateCRUD;

import java.util.Scanner;

import com.Dao.ProductDao;
import com.Dao.ProductDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Scanner sc= new Scanner(System.in);
        ProductDao pf= new ProductDaoImpl();
        int option;
        do {
        	System.out.println("Enter 1 for insert the data");
        	System.out.println("Enter 2 for getAllProduct");
        	System.out.println("Enter 3 for updateByID");
        	System.out.println("Enter 4 for getProductByID");
        	System.out.println("Enter 5 for deleteStudentById");
        	System.out.println("Enter 0 for exit");
        	 option = sc.nextInt();
        	
        	switch(option) {
        	case 1:
        		pf.insert();
        		break;
        	case 2:
        		pf.getAllProduct();
        		break;
        	case 3:
        		pf.updateById(1);
        		break;
        	case 4:
        		pf.getProductById(1);
        		break;
        	case 5:
        		 pf.deleteProductById(2);
        		 break;
        	}
        	
        }while(option!=0);
        
    }
}
