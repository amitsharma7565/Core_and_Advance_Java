/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.Scanner;
import java.util.ArrayList; 

class SearchingElement {
  //main method
  public static void main(String args[]){
    //declare variables
    int size;
    String str;
    //create scanner object
    Scanner sc=new Scanner(System.in);
    ArrayList<String>list=new ArrayList<String>();
    System.out.println("Enter how many Elements you want:");
    //take input from user
    size=sc.nextInt();
    System.out.println("Enter the Elements");
    for(int i=0;i<size;i++){
      list.add(sc.next());
    }
    //check if the search element is present on the list using contains method
    System.out.println("Enter search element");
    str=sc.next();
    
//If element found then print element is present else then print element not present
    
    if(list.contains(str)){
      System.out.println(str+" Element is present");
    }
    else{
      System.out.println(str+" Element is not present");
    }
  }
}