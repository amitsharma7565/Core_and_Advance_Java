/* 5. Write a Java program to accept directory name, file name from user. Do the following steps using File class.
   ==> Create directory with user entered directory name
   ==> Create file in given directory.
   ==> Accept one sentence about bitLabs and store in give file using FileOutputStream class.
   ==> Read data from given file and display read data on console using FileInputStream class.
*/

import java.io.*;
import java.util.*;
public class CreatingDirectory {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      
      try{
        System.out.println("Enter directory name");
        String dr=sc.nextLine();
        File fl=new File(dr);
        boolean value=fl.mkdir();
        if(value){
          System.out.println("directory created");
        }
        System.out.println("Enter file name");
        String file=sc.nextLine();
        File f=new File(dr+"/"+file);
        boolean value1=fl.mkdir();
        if(value1){
          System.out.println("file created");
        }
        FileOutputStream fs=new FileOutputStream(f);
        String s="One sentence about bitlabs";
        fs.write(s.getBytes());
        FileInputStream fi=new FileInputStream(f);
        int a;
        while((a=fi.read())!=-1){
          System.out.println((char)a);
        }
    }
      catch(Exception e){
        System.out.println(e);
      }
}
}

