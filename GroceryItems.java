/* JFM1T5_Assignment 2:
   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {
  // Define the main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Declare and initialize variables
    int n;
    System.out.println("Enter the size ");
    n = sc.nextInt();

    int arr[] = new int[n];
    // Take the 10 different expenses price
    System.out.println("Enter the price ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    // Check the 10 different expenses price using for loop
    for (int i = 0; i < n; i++) {
      // Calculate the highest price in all expenses and check if the expenses is more
      for (int j = i + 1; j < n; j++) {
        // than new item. If true then return max.
        if (arr[i] < arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    // Print the result
    System.out.println("Largest element is " + arr[0]);

  }
}
