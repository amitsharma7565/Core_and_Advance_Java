
/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   Expected Output: 10,9,6,4,3

 */
import java.util.Scanner;

public class AscendingOrder {

  // main method
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // take input from user

    System.out.print("Enter array size ");
    int integers = sc.nextInt();
    int arr[] = new int[integers];
    System.out.println("enter the values");
    for (int i = 0; i < integers; i++) {
      sc.useDelimiter("\\D");
      arr[i] = sc.nextInt();
    }
    int temp;
    // check all elements using for loop
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        // check if first number is greater than the second number or not if true then
        // swap
        if (arr[i] < arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    // check and print result
    System.out.println("Array in Ascending Order");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}