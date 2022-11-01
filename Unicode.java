//JFM1T3_Assignment3:
/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.

  Sample Input:
       character=M

  Expected Output:
      ASCII value of M is:77

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Unicode {

  // Define main method
  public static void main(String args[]) {
    // Use the scanner class to provide character at execution time
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character: ");
    char chr = sc.next().charAt(0);
    int asciiValue = chr;
    // Print the Result
    System.out.println("ASCII value of " + chr + " is:" + asciiValue);
  }
}