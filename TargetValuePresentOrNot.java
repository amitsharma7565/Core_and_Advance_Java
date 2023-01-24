/*4. Write a program to sort given array and accept integer value [target value] from user and check 
      the target value is present in the given array or not using binary search technique. 
      If target exists, then return its index. Otherwise, return -1. 
      Sample Input1: array = [-1,0,3,5,9,12], target = 9
      Expected Output: 9 exists in array and its index is 4

      Sample Input: array = [-1,0,3,5,9,12], target = 2
      Expected Output: Explanation: 2 does not exist in array
*/ 

import java.util.*;
public class TargetValuePresentOrNot {
  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
public static void main(String[] args) {
    int[] array = {-1, 0, 3, 5, 9, 12};
  Scanner sc=new Scanner(System.in);
  System.out.println("target = ");
    int target =sc.nextInt();
    Arrays.sort(array);

    int index = binarySearch(array, target);
    if (index != -1) {
      System.out.println(target + " exists in array and its index is " + index);
    } else {
      System.out.println(target + " does not exist in array");
}
}
}