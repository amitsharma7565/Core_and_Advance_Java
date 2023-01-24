/*4. Write a program to print the array elements after each iteration of the outer loop.  
      Use insertion sort to sort the given values.

      Sample Input:-  n = 3 , arr =[5,2,1]
      Expected Output:- 
      The array elements after 1st iteration of the outer loop
      2
      5
      1
      The array elements after 2nd iteration of the outer loop
      1
      2
      5
*/
import java.util.*;
public class StepInsertion_Exercise {

public static void main(String[] args) {
    int arr[]={5, 2, 1};
    int n=arr.length;
    for (int i=1;i<n;i++) {
      int key=arr[i];
      int j=i-1;

      while (j>=0 && arr[j]>key) {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;

      // print the array elements after each iteration of the outer loop
      System.out.println("The array elements after " + i + " iteration of the outer loop");
      System.out.println(Arrays.toString(arr));
}
}
}