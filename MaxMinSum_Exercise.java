/*2. Given an array of n integers. Write an efficient java code using merge sort algorithm to 
      find the sum of  First and last element i. e., smallest and largest elements in the array. 
      also print the sorted array.
      Sample Input:- n=5 , arr=[1,4,2,3,5]
      Expected Output:- Sum is 6
      Smallest Element : 1
      Largest element : 5
*/

 import java.util.*;
public class MaxMinSum_Exercise {
   public static void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
      int m = (l+r)/2;
      mergeSort(arr, l, m);
      mergeSort(arr, m+1, r);
      merge(arr, l, m, r);
    }
  }
  public static void merge(int[] arr, int l, int m, int r) {
  
    int n1 = m - l + 1;
    int n2 = r - m;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for (int i = 0; i < n1; i++) {
      L[i] = arr[l + i];
    }
    for (int j = 0; j < n2; j++) {
      R[j] = arr[m + 1 + j];
    }
    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
public static void main(String[] args) {
    int[] arr = {1, 4, 2, 3, 5};
    int n = arr.length;
    mergeSort(arr, 0, n-1);
    System.out.println("Sorted array: " + Arrays.toString(arr));
    int sum = arr[0] + arr[n-1];
    System.out.println("Sum is " + sum);
    System.out.println("Smallest element: " + arr[0]);
    System.out.println("Largest element: " + arr[n-1]);
}
}
