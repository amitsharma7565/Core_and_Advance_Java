// Write a Java program to join two array lists.
import java.util.*;
class ArrayListJoin{
  public static void main(String args[]){
  ArrayList<String> a=new ArrayList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    a.add("e");
  ArrayList<String> a1=new ArrayList<String>();
    a.add("f");
    a.add("g");
    a.add("h");
    a.add("i");
    a.add("j"); 
  ArrayList<String> a2=new ArrayList<String>();
    a2.addAll(a);
    a2.addAll(a1);
    System.out.println(a2);
  }
  
}