/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.*;

public class InsertionSort {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the values");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Sorting element is:");
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        int temp=0;
        if(arr[i]>arr[j]){
          temp=arr[i]; 
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
      System.out.println(arr[i]);
    }
  }
}
