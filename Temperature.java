/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/

import java.util.Scanner;

public class Temperature {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("Enter number of days");
    // Declare the variables and initialize
    n = s.nextInt();
    float a[] = new float[n];
    float less;
    // Take temperature of 7 days as a input from user
    for (int i = 0; i < n; i++) {
      i = i + 1;
      System.out.println("Enter the temperature of day" + i);
      i = i - 1;
      a[i] = s.nextFloat();
    }
    // Calculate the lowest temperature
    less = a[0];
    int index = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] < less) {
        less = a[i];
        index = i + 1;
      }
    }
    // Print the result
    System.out.println("the lowest temperature of the week " + index + " is " + less + " celsius");
  }
}