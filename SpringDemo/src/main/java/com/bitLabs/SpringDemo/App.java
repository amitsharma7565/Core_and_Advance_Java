package com.bitLabs.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        
        Student std = (Student) context.getBean("stu");
        
        System.out.println(std);
        
        Student std1 = (Student) context.getBean("stud1");
        
        System.out.println(std1);
        
        
    }
}
