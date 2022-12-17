// Write a Java program to trim the capacity of an array list the current list size
import java.util.*;
class ArrayListTrim{
  public static void main(String args[]){
    ArrayList<String>a=new ArrayList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    a.add("my name is ");
    // System.out.println(a);
    a.trimToSize();
    for(Object obj:a){
      System.out.println(obj);
    }
    
  }
}