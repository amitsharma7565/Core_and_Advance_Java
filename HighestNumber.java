/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/


//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class HighestNumber {

public static void main(String [] args)
{
  //Declare the three variables
    int x,y,z;
  //Use the scanner class to provide input at execution time
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first number:");
    x=s.nextInt();
    System.out.println("Enter the second number:");
    y=s.nextInt();
    System.out.println("Enter the third number:");
    z=s.nextInt();
    
//check which number is highest using if else condition
if(x>y && x>z)
{
    System.out.println( x +" is highest number");

}
else if(y>x && y>z)
{
    System.out.println(y +" is highest number");
}
else
System.out.println(z +" is highest number");
//Print the highest of three numbers 
}  
}