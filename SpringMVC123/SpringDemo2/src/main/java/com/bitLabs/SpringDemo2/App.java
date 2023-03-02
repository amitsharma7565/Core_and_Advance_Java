package com.bitLabs.SpringDemo2;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
        Object obj1= (Object)context.getBean("stu");
        Object obj2= (Object)context.getBean("add");
        Object obj3= (Object)context.getBean("book");
        
        
        List<Object> list1 = new ArrayList();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);
        
        
        for(int i=0;i<list1.size();i++) {
        	if(i==0)
        	{
        		Student st= (Student) list1.get(i);
        		System.out.println(st);
        	}
        	
        }
        
    }
}
