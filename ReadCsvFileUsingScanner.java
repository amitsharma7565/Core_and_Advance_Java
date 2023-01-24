/* 2.Write a program to read data from matches.csv file and find out how many times the given team has lost using Scanner class?

   Sample Input: 
   Enter Team name: Sunrisers Hyderabad
   Expected Output:  Sunrisers Hyderabad Team have lost 4 times.
*/

// importing io and util packages
import java.io.*;
import java.util.*;
//creating class ReadCsvFileUsingScanner 
public class ReadCsvFileUsingScanner {

   public static void main(String args[]) {
     try{
       Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Team name");
     String name = sc.nextLine();
    
       Scanner s = new Scanner(new File("matches.csv.xls")); 
     int count=0;
     s.useDelimiter("\n");
     while(s.hasNext()){
       String arr[]=s.next().split(",");
       if(arr[3].equals(name) || arr[4].equals(name)){
         if(!arr[7].equals(name)){
            count++;
         }
       }     
     }
     System.out.println(name+" Team have lost "+count+" times");
   }
     catch(Exception e){
  System.out.println(e);
}
}
}