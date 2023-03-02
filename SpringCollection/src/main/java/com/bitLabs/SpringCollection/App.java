package com.bitLabs.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Address;
import com.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
//        Student std=  (Student) context.getBean("stu");
        Address add= (Address) context.getBean("add");
        System.out.println(add);
    }
}
