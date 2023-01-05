/* 3. Write a Java program to find the longest word and smallest word in a text file.

    Sample Input: Create text file and write some data to the file. 
    Sample Data: "Welcome to bitLabs"

    Expected Output: 
    Longest word: Welcome
    Smallest word: to
*/

import java.io.*;
import java.util.*;
public class FindingLongestSmallestWord {

  public static void main(String[] args) throws IOException {
  
    FileReader fr = new FileReader("test.txt");
    BufferedReader br = new BufferedReader(fr);
    String str;
    String ar[] = new String[80];
    ArrayList<String> list = new ArrayList<String>();
    while ((str = br.readLine()) != null) {
    //  System.out.println(st);
      ar = str.split(" ");
      Collections.addAll(list, ar);
    }
  String longest="";
  String smallest="";
  int min=ar[0].length();
    int max=ar[0].length();
    
    for (int i = 1; i < ar.length; i++) {
        if(ar[i].length()>max){
          max=ar[i].length();
          longest=ar[i];
        }
    }
    for(int i=1;i<ar.length;i++){
        if(ar[i].length()<min){
          min=ar[i].length();
          smallest=ar[i];
        }
      }
     System.out.println("the longest word is:"+longest);
    System.out.println("the smallest word is:"+smallest);
  }


    }

