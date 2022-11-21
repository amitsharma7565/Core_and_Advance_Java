/* JFM1T6_Assignment2:
Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.*;

public class Power {

  static int expo(int num1, int num2) {
    int num3 = 1;
    for (int i = 1; i <= num2; i++) {
      num3 = num3 * num1;

    }
    return num3;
  }

  // main method
  public static void main(String[] args) {

    // declare variables n,p,r and initialize r as one.

    // create scanner class object
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base value:");
    // take input from user
    int num1 = sc.nextInt();
    System.out.println("Enter Exponential value:");
    int num2 = sc.nextInt();
    // check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if
    // true then print zero else multiply r*n

    // print result
    Power a = new Power();
    System.out.println("POWER of " + num1 + " is:" + a.expo(num1, num2));
  }
}
