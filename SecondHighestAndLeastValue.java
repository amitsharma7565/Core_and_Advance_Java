/*3. Write a program to find second highest value and second least value in the given array values. 
   Sample Input: array[]= {5, 10, 20, 15, 50}
   
   Expected Output: 
   Second highest value: 20
   Second least value: 15
*/

import java.util.*;
public class SecondHighestAndLeastValue {
  public static void main(String[] args) {
    int[] array = {5, 10, 20, 15, 50};
    Arrays.sort(array);
    int secondHighest = array[array.length - 2];
    System.out.println("Second highest value: " + secondHighest);
    int secondLowest = array[1];
    System.out.println("Second lowest value: " + secondLowest);
}
}