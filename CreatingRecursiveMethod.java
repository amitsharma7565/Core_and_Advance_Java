/*2. Write a program to create a recursive method to check the given target value is present 
      in array or not using binary search technique. If target exists, then return its index. 
      Otherwise, return -1. 

      Sample Input1: array = [-1,0,3,5,9,12], target = 9
      Expected Output: 9 exists in array and its index is 4
 
      Sample_Input2: array = [-1,0,3,5,9,12], target = 2
      Expected Output: 2 does not exist in array 
*/

import java.util.*;
public class CreatingRecursiveMethod {
  public static int binarySearch(int[] array, int target, int l, int h) {
    if (l > h) {
      return -1;
    }
    int mid = l + (h - l) / 2;
    if (array[mid] == target) {
      return mid;
    } else if (array[mid] > target) {
      return binarySearch(array, target, l, mid - 1);
    } else {
      return binarySearch(array, target, mid + 1, h);
    }
  }
  
  public static void main(String[] args) {
    int[] array = {-1, 0, 3, 5, 9, 12};
    Scanner sc=new Scanner(System.in);
    System.out.print("target =");
    int target =sc.nextInt();
    int index = binarySearch(array, target, 0, array.length - 1);
    if (index == -1) {
      System.out.println(target + " does not exist in array");
    } else {
      System.out.println(target + " exists in array and its index is " + index);
}
}
}