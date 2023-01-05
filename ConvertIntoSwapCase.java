/* 3. Write a Java program to read data from input file and convert all the characters into swap case then 
      write into output file using FileInputStream and FileOutputStream classes.

      Sample Input: Create text file and write some data to the file. 
      Sample Data: "Hi, This is Sample data"
      Expected Output: hI,tHIS IS sAMPLE DATA

*/

import java.io.*;
public class ConvertIntoSwapCase {

    public static void main(String args[]) throws IOException {
      FileInputStream file=new FileInputStream("input.txt");
      int ch;
      String str="";
      String str1="";
      while((ch=file.read())!=-1){
        str=str+(char)ch;
      }
      System.out.println(str);
      String arr[]=str.split("");
      for(int i=0;i<arr.length;i++){
        char [] c=arr[i].toCharArray();  
      
      for(int j=0;j<c.length;j++){
        
        if(Character.isUpperCase(c[j])){
          char d = Character.toLowerCase(c[j]);
           str1=str1+d;  
      }
        else{
          char d = Character.toUpperCase(c[j]);
           
             str1=str1+d;
        }
      }
      str1=str1+" ";
    }
    System.out.println(str1);
    FileOutputStream fs=new FileOutputStream("output.txt");
   char c[] = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {  
            fs.write(c[i]);
      }
    }
}

