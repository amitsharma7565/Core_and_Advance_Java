package com.bitLabs.SpringLastWring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
//        Address add= (Address) context.getBean("add");
        Employee emp= (Employee) context.getBean("emp");
        System.out.println(emp);

    }
}

