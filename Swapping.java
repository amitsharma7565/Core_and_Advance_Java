/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {
  // main method
  public static void main(String args[]) {
    // Use the scanner class to provide input at execution time using scanner object
    Scanner sc = new Scanner(System.in);
    // Take input from user System.out.println("Enter first number: ");
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Before swapping: " + a + " " + b);
    // swapping two numbers without using third variable
    a = a + b;
    b = a - b;
    a = a - b;
    // print result
    System.out.println("After swapping: " + a + " " + b);
  }
}