/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/
import java.util.Scanner;
class Student{
//Declare the variables
  int Id;
  String name; 
  double salary;
  Student() { }
//Create a method getInput() 
  Scanner sc=new Scanner(System.in);//create Scanner object
  void getInput()
  {
//take input from user
    System.out.println(" Employee id"); 
    Id=sc.nextInt();
    System.out.println("Enter the name"); 
    name=sc.next();
    System.out.println("Enter the salary"); 
    salary=sc.nextDouble();
  }
  void display() //create display method
  {
    System.out.println("**** Stored data displayed below ****");
    System.out.println("Employee id="+Id);
    System.out.println("Enter the name="+name);
    System.out.println("Enter the salary="+salary);
   //Print Employee details
   } 
   } 
class Employee { 
public static void main(String args[]) //main 
  { 
    Student st[ ]=new Student[5]; //creating object
    for(int i=1;i<=3;i++) 
  { 
    st[i]=new Student(); 
    st[i].getInput(); //goto getInput method
    st[i].display(); //goto display method
  }
  }
  }