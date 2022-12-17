// Write a Java program to replace the second element of a ArrayList with the specified element
import java.util.*;
class ArrayListReplace{
  public static void main(String args[]){
    ArrayList<String>a=new ArrayList<String>();
    a.add("amit");
    a.add("Sharma");
    String s="negi";
    // System.out.println(a);
    a.set(1,s);
    System.out.println(a);
    for(Object obj:a){
      System.out.println(obj);
    }
  }
}