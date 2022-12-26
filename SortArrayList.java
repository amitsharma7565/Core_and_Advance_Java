/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  

public class SortArrayList  {  
  //main method
  public static void main(String args[]){
    //declare variables
    int size;
    //create Scanner object
    Scanner sc=new Scanner(System.in);
    //create an object of ArrayList class
    ArrayList<Integer>list=new ArrayList<Integer>();
    //take input from user
    System.out.println("Enter how many numbers you want: ");
    size=sc.nextInt();
    for(int i=0;i<size;i++){
      System.out.println("Enter Number "+i);
      list.add(sc.nextInt());
    }
    //sort ArrayList in ascending oeder
    Collections.sort(list);
    System.out.println("ArrayList After Sorting:");
    //print Array list
    for(int print:list){
      System.out.println(print);
    }
  }
}