/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/

import java.util.Scanner;

class Person { 
//declare age 
private int age;
  //create setters 
public void setAge(int newvalue)
{
    age=newvalue;
}
  // getters
public int getAge()
{
    return age;
}    
}  

class PersonEncapsulation { 
//main method
public static void main(String args[]) { 
int i;
//create Scanner object
Scanner sc=new Scanner(System.in);
//take input from user
System.out.print("Enter age:");
i=sc.nextInt();
Person obj=new Person();
obj.setAge(i);
  // Output age  
System.out.println("your age:"+obj.getAge());
}   
} 