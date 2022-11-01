/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int b= a-- - --a;
     2. int c=a--;
     3. int d=a>>2;
     4. int e=a&b;
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter a value: 
     20
     Enter b value: 
     10
     
     Expected Output:
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&bis: 0
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Expression {
  // main method
  public static void main(String args[]) {
    // Use the scanner class to provide input at execution time using scanner obje
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    // Take input from user System.out.println("Enter a value: "); int");
    int a = sc.nextInt();

    int b = a-- - --a;
    int c = a--;
    int d = a >> 2;
    int e = a & b;
    // print appropriate result for Expression operato
    System.out.println("a-- - --a" + b);
    System.out.println("a-- is: " + c);
    System.out.println("a>>2 is:" + d);
    System.out.println("a&b is " + e);

  }
}