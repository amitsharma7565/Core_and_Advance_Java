
/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/
import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String args[]) {
    // Define the main method
    Scanner s = new Scanner(System.in);
    // Declare the variables
    int n1 = 0, n2 = 0;
    // Take input from user to enter rows and column values
    System.out.println("enter the number of rows");
    n1 = s.nextInt();
    System.out.println("enter the number of columns");
    n2 = s.nextInt();
    // Declare and initializing the variables
    int arr1[][] = new int[n1][n2];
    int arr2[][] = new int[n1][n2];
    // Loop through the array to size of 33 matrix
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        i = i + 1;
        j = j + 1;
        // entering the elements
        System.out.print("Elements " + "[" + i + "," + j + "] : ");
        i = i - 1;
        j = j - 1;
        // reading the input values
        arr1[i][j] = s.nextInt();
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        // Convert the square matrix into transpose
        arr2[i][j] = arr1[j][i];
        // Print the transpose matrix
        System.out.print(arr2[i][j] + " ");
        // printing j and i instead of i and j
      }
      System.out.println();
    }

  }
}