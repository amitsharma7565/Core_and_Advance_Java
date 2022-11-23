/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;

public class StudentConstructor {

//main method
public static void main(String args[])
{
   StudentConstructor obj = new StudentConstructor(); 
}

//initialize Student class using constructor
StudentConstructor()
{
    Scanner sc = new Scanner(System.in);
    //Get student name and rollno from user and set it to the Student object  
    Student s = new Student();
    
    System.out.print("Enter Student name : ");
    s.setName(sc.nextLine());
    String name=s.getName();
 
    System.out.print("Enter Student rollno : ");
    s.setRollNo(sc.nextInt());
    int rollNo=s.getRollNo();
    //print result
    System.out.println("\nName : "+name+"  "+"Roll No : "+rollNo);
}
}
//Create Student class in that declare variables name and roll number 
class Student 
{
    String name;
    int rollNo;

    //add  setter method for rollno
    public void setRollNo(int rollNo)
    { 
         this.rollNo = rollNo; 
    } 

    //add getter method for rollno
    public int getRollNo()
    { 
      return rollNo; 
    } 

//add setters and getters for name fields also
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    { 
      return name; 
    } 
}
