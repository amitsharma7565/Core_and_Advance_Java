package com.bitlabs.SpringcoreComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.bitlabs.Entity.one.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    
        //Student student=(Student) context.getBean("student");
        //System.out.println(student);
        //System.out.println(student.getList());
        Student student=(Student) context.getBean("stu"); //this is called in morning
        System.out.println(student.hashCode());
        
        Student student1=(Student) context.getBean("stu"); //this is called in afternoon
        System.out.println(student1.hashCode());
        
        
    }
}
