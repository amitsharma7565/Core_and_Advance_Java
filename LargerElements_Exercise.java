/*5. Write a program to sort an array using Quick sort algorithm and accept X value from user and 
      print all the elements in the array whose values are greater than X.
      Sample Input:- n=5 , arr=[1,4,2,3,5],  x=2
      Expected Output:- number of elements greater than x is 3
      Elements are: 3, 4, 5
*/

import java.util.*;
public class LargerElements_Exercise {
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high);
      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
      }
    }
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;
    return i;
  }


  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the values of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the value of x: ");
    int x = sc.nextInt();
    quickSort(arr, 0, n - 1);
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > x) {
        count++;
      }
    }
    System.out.println("Number of elements greater than x is " + count);
    System.out.print("Elements are: ");
    for (int i = 0; i < n; i++) {
      if (arr[i] > x) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
}
}