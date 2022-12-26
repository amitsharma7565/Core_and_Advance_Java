/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/


import java.util.*;

public class HashDemo {
  //main method
  public static void main(String args[]){
    String choice="";
    //declare the HashMap 
    HashMap<Integer,String>has=new HashMap<Integer, String>();
    Scanner sc=new Scanner(System.in);
    //create a while loop for user not enter no
    do{
      //ask for user input for value and key
      System.out.println("Enter Emp code:");
      int empcode=sc.nextInt();
      System.out.println("Enter Emp Name:");
      String empname=sc.next();
      //add the user inputs to the HashMap
      has.put(empcode,empname);
      //ask user if they want to enter another student details
      System.out.println("Enter another student (y/n)?");
      choice=sc.next();
      //condition to satisfy in order to loop again
    }while(choice.equals("y"));
    //use for each loop to grab Emp code and Emp Name
    for(Map.Entry m:has.entrySet()){
      //print Emp Name
      System.out.println(m.getValue());
    }
  }
}