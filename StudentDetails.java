
/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/
import java.io.*;
import java.util.*;

public class StudentDetails {
  public static void main(String args[]) throws IOException{
   FileReader fr=new FileReader("studentdetails.txt");
    BufferedReader br=new BufferedReader(fr);
    String line;
    String topstudent="";
    int topmarks=0;
    while((line=br.readLine())!=null){
      String words[]=line.split(",");
      String name=words[0];
      int marks=Integer.parseInt(words[1]);
      if(marks>topmarks){
        topmarks=marks;
        topstudent=name;
      }
    }
   // br.close();
    System.out.println("Top student: " + topstudent);
    System.out.println("Top marks: " + topmarks);
  
 }
    
} 
