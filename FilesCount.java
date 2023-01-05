/* 4. Write a java program to count the list of files based on their extension using File class. 
      Display following files count on console. 
     ==> Number of text files
     ==> Number of document files
     ==> Number of image files
     ==> Number of other files

   Sample Input: Create folder and create different files such as document, pdf, image and text files.

   Expected Output: 
    Number of text files: 5
    Number of document files: 3
    Number of image files: 4
    Number of other files: 3
*/

import java.io.*;
import java.util.*;
public class FilesCount {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int tcount=0,dcount=0,icount=0,ocount=0;
      try{
        System.out.println("Enter Folder");
        String folder=sc.nextLine();
        File fl=new File(folder);
        boolean value=fl.mkdir();
        if(value){
          System.out.println("folder created");
        }
        System.out.println("Enter files in folder");
        for(int i=0;i<15;i++){
          String s=sc.nextLine();
          File f=new File(folder+"/"+s);
          boolean v=f.createNewFile();
          if(s.endsWith(".txt")){
            tcount++;
          }
          else if(s.endsWith(".jpg")) {
            icount++;
          }
          else if(s.endsWith(".doc")) {
            dcount++;
          }
          else{
            ocount++;
          }
        }
        System.out.println("Number of text files: "+tcount);
        System.out.println("Number of image files: "+icount);
        System.out.println("Number of document files: "+dcount);
        System.out.println("Number of other files: "+ocount);
        
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
