/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.Scanner;

public class FindNumberInArray {
  // main method
  public static void main(String args[]) {
    // creating Scanner object
    Scanner sc = new Scanner(System.in);
    // take input from user
    System.out.println("Enter the Array Size");
    // declaring variables
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the values");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    // find number in array
    System.out.println("Enter the number to search");
    int search = sc.nextInt();
    boolean num = false;
    // search the element if found print that position else print not found message
    for (int i = 0; i < size; i++) {
      if (arr[i] == search) {
        num = true;
        System.out.println(search + "found at index " + i);
      }

    }
    if (num == false) {
      System.out.println("Sorry! " + search + " is not found in array.");
    }

  }
}
