/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/


import java.util.*;
public class Priority {
  //main method
  public static void main(String args[]){
    //create Scanner object
    Scanner sc=new Scanner(System.in);
    //initialize priority queue object
    PriorityQueue<String>l=new PriorityQueue<String>();
    System.out.println("Enter how many colors you want:");
    int num=sc.nextInt();
    //take input from user and add that values to the priority queue object
    System.out.println("Enter Colors:");
    for(int i=0;i<num;i++){
      l.add(sc.next());
    }
    System.out.println("Elements of the Priority Queue: ");
    String space=" ";
    for(int i=0;i<num;i++){
      //print result using poll method
      System.out.print(space+l.poll());
      space=",";
    }
  }
}










