/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/
import java.util.*;
public class MapCount {
    // main method
  public static void main(String args[]){
     // declare HashMap object
    HashMap<Integer, String> has=new HashMap<Integer, String>();
    String choice="";
    Scanner sc=new Scanner(System.in);
      // create a while loop for user not enter no
    do{
       // ask for user input for value and key
      System.out.println("Enter value: ");
      int value=sc.nextInt();
      System.out.println("Enter key: ");
      String key=sc.next();
      // add the user inputs to the HashMap
      has.put(value,key);
      // ask user if they want to enter another
      System.out.println(" Enter another student (y/n)?");
      choice =sc.next();
      // condition to satisfy in order to loop again
    }while(choice.equals("y"));
    // print total size as result
      System.out.println("The size of the map is "+has.size());
  }
  }


 



 

  

  

  

  

