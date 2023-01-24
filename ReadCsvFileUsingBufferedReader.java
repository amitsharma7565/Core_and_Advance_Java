/* 1.Write a program to read data from matches.csv file and find out how many 
   times the given team won in a given year using BufferedReader class? 

   Sample Input: 
   Enter Team name: Sunrisers Hyderabad
   Enter Year   : 2017
   Expected Output:  Sunrisers Hyderabad Team won 9 times in 2017
*/

// importing io and util packages
import java.io.*;
import java.util.*;
//creating class ReadCsvFileUsingScanner 
public class ReadCsvFileUsingBufferedReader {


   public static void main(String args[]) throws Exception{
     try{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Team name");
    String tName=sc.nextLine();
    System.out.println("Enter Year");
    String year= sc.next();
     

     
     FileReader fr=new FileReader("matches.csv.xls");
     BufferedReader br=new BufferedReader(fr);

     String str;
       int count=0;
     while((str=br.readLine())!=null){
       String arr[]=str.split(",");
       if(arr[1].equals(year)&&arr[7].equals(tName)){
           count++;
       }
     }
       System.out.println(tName+ " "+"Team won "+ count+" times in "+year);
     }
     catch(Exception e){
       System.out.println(e);
     }
   }
}
