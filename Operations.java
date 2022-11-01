/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

  // main method
  public static void main(String args[]) {
    int c;
    // Use the scanner class to provide input at execution time using scanner object
    Scanner sc = new Scanner(System.in);
    // Take input from user System.out.println("Enter first number: ")
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    // calculate difference
    c = a - b;
    System.out.println("Difference of two numbers: " + c);
    int s3;
    System.out.println("Enter first number: ");
    int s1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int s2 = sc.nextInt();
    // product
    s3 = s1 * s2;
    System.out.println("product of two numbers: " + s3);

    int f3;
    System.out.println("Enter first number: ");
    int f1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int f2 = sc.nextInt();
    // division
    f3 = f1 / f2;
    System.out.println("division of two numbers: " + f3);

    System.out.println("Enter number: ");
    int j1 = sc.nextInt();
    // increment decrement
    j1++;
    j1--;
    System.out.println("increment and decrement the number: " + j1);
    int k;
    System.out.println("Enter first number: ");
    int i = sc.nextInt();
    System.out.println("Enter second number: ");
    int j = sc.nextInt();
    // remainder
    k = i % j;
    System.out.println("Remainder of two numbers: " + k);
    ;
  }
}