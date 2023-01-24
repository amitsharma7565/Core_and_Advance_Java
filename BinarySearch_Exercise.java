/*1. Write a program to find target element in the given array using binary 
      search technique and check if the target element is prime number or not.

      Sample Input1: A = [23,45,67,78,86,90]
                      Target element is: 67
      Expected Output:  67 is present in 2nd index position and it is prime number

      Sample Input2: A = [23,45,67,78,86,90]
                     Target element is: 86
      Expected Output:  86 is present in 4th index position and it is not a prime number
*/

import java.util.*;
public class BinarySearch_Exercise {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr= {23, 45, 67, 78, 86, 90};
   System.out.println("Target element is: ");
    int target = sc.nextInt();
     int low = 0;
    int high = arr.length - 1;
    int mid = 0;
    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] == target) {
        break;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    boolean isPrime = true;
    if (target == 1) {
      isPrime = false;
    } else if (target == 2 || target == 3) {
      isPrime = true;
    } else {
      for (int i = 2; i <= Math.sqrt(target); i++) {
        if (target % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    System.out.print(target + " is present in " +mid+ " index position and it is ");
    if (isPrime) {
      System.out.println("a prime number");
    } else {
      System.out.println("not a prime number");
}
}
}