/* 4. Write a program to read data from matches.csv file and find out how many times a given player won
      the man of the match award in a given year?
   Sample Input:
   Enter player Name: Yuvraj Singh
   Enter Year:        2017

   Expected Output: 2 times
*/
import java.io.*;
import java.util.*;
public class ManOfTheMatchAward {
   public static void main(String args[]) throws Exception {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter player name");
     String pName=sc.nextLine();
     System.out.println("Enter the year");
     String year= sc.nextLine();

     FileReader fr = new FileReader("matches.csv.xls");
     BufferedReader br = new BufferedReader(fr);

     String str;
     int count=0;
     while((str=br.readLine())!=null){
       String arr[]=str.split(",");
       if(arr[1].equals(year)&&arr[10].equals(pName)){
         count++;
       }
     }
     System.out.println(count+" Times");
   }
}
