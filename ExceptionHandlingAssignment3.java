/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException.Create an array variable with n size, accept values from user and store values into array, finally print all values on console.
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/

import java.util.*;
class ExceptionHandlingAssignment3{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array values");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    //ArrayIndexOutOfBoundsException occur when i values  is greater than length of the array 
    for(int i=0;i<arr.length;i++){
      try{
        System.out.println(arr[i]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
      }
      
    }
  }
}