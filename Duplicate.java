/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;

class Duplicate {

  // main method
  public static void main(String[] args) {
    // create Scanner object
    Scanner sc = new Scanner(System.in);
    // take input from user
    ArrayList<Integer> cool = new ArrayList<Integer>();
    System.out.print("enter the size of array list :");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print("Enter number " + i + " : ");
      cool.add(sc.nextInt());
    }

    // creat an object of LinkedHashSet class
    LinkedHashSet<Integer> obj = new LinkedHashSet<Integer>(cool);
    // creat an object of ArrayList class and pass LinkedHashSet object
    ArrayList<Integer> num1 = new ArrayList<Integer>(obj);
    // Print result
    System.out.println("After removing duplicates: " + num1);
  }
}
