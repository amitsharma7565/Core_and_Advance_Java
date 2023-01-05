/* 4. Write a Java program to read data from input file and find word count in each line and longest word in each line. 
      Handle IOException while reading data from input file.

     Sample Input: Create text file and write some data to the file.
     Expected Output:
     Number of words in line number1: 4 and longest word is: "     “ (Print longest word in first line)
     '
     '
     '
     Number of words in line number n: 7 and longest word is: "    “ (Print longest word in last line)
*/
import java.util.*;
import java.io.*;
public class LongestWordInEachLine {

    public static void main(String args[]) throws IOException {
      FileReader fis1 = new FileReader("data2.txt"); // Charcter stream
    BufferedReader br = new BufferedReader(fis1);
    String str;
    
    ArrayList<String> al = new ArrayList<String>();
    while ((str = br.readLine()) != null) {
      
      String []arr = str.split(" ");
      for(int k=0;k<arr.length;k++){
        al.add(arr[k]);
      }
      String logest="";
      String smallest="";
      int min=20;
      int max=0;
    
      int [] fre=new int[al.size()];
    
     for (int i = 0; i < arr.length; i++) {
      int a=arr[i].length();
        if(a>max){
          max=a;
          logest=arr[i];
        }
        else if(a<min){
          min=a;
          smallest=arr[i];
        }
      }
     System.out.println("Lognest word in line : "+logest);
    System.out.println("Smallest word in each line : "+smallest);
      System.out.println();
      al.clear();
}  
}
}