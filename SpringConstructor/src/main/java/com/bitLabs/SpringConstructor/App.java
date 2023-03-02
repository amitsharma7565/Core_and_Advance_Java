package com.bitLabs.SpringConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Ambiguity;
import com.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//        Employee emp= (Employee) context.getBean("emp");
//        System.out.println(emp);
//        Employee emp2= (Employee) context.getBean("emp2");
//        System.out.println(emp2);
//        Employee emp3= (Employee) context.getBean("emp3");
//        System.out.println(emp3);
        	Ambiguity amb2=  (Ambiguity) context.getBean("amb2");
        	amb2.show();
        	System.out.println(amb2);
        
        
    }
}
