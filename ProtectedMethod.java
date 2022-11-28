/* JFM1T10_Assignment5:

     Write a program to access a protected method of a class in different package. 

     Sample Output:
     Try to access the protected method outside the package using inheritance
    
*/

//Create a folder called package1

//Inside the folder create a Demo class with the package name as package1. In that define a protected variable

//Outside the folder create ProtectedMethod class and import the package1
import package1.Demo;

class ProtectedMethod {

  // Define main method
  public static void main(String args[]) {
    // Access and print x of Demo class
    Demo obj = new Demo();
    obj.disp();
  }
}