/*1. Write a program to create a new Thread by extending from Thread class, read data from studentdetails.txt 
     file using child Thread and read data from employee.txt file using main Thread. And print student details 
     first then employee details. Use join method to achieve this task. Before running this program create following files 
     • Create StudentDetails.txt file and enter 3 students’ information such as name, marks, college_name 
     • Create employee.txt and enter 3 employees’ information such as name, salary and department_name.*/

import java.io.*;
class ThreadSample extends Thread{
  public void run(){
    try{
      FileReader f=new FileReader("Student.txt");
    BufferedReader bf= new BufferedReader(f);
       String str;
    
      while((str=bf.readLine())!=null){
      System.out.println("Student details are:"+ str);
    }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}

public class CreateThread  {

	public static void main(String args[]) {
	ThreadSample ts= new ThreadSample();
    ts.start();
     try{
      ts.join();
    }
    catch(Exception e){
      System.out.println(e);
    }
    
    try{
       FileReader fr=new FileReader("Employee.txt");
    BufferedReader br= new BufferedReader(fr);
    String str;
    while((str=br.readLine())!=null){
      System.out.println("Employee deatils are: "+str);
    }
    }
    catch(Exception e){
      System.out.println(e);
    }
   
	}
}
