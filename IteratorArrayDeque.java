/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/

import java.util.*;

public class IteratorArrayDeque {
  public static void main(String args[]){
    //create Scanner object
    Scanner sc=new Scanner(System.in);
    //create an empty ArrayDeque
    ArrayDeque<Integer>list=new ArrayDeque<Integer>();
    System.out.println("How many number you want enter");
    int num=sc.nextInt();
    //take input from user
    System.out.println("Enter the numbers");
    for(int i=0;i<num;i++){
      list.add(sc.nextInt());
    }
    System.out.println("ArrayDeque: "+list);
   //create an iterator
    Iterator itr=list.iterator();
    System.out.println("The iterator values are: ");
    //Display the values after iterating through the Deque 
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}















