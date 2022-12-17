// Write a Java program to compare two array lists
import java.util.*;
class ArrayListCompare{
  public static void main(String args[]){
    ArrayList<String> a=new ArrayList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    ArrayList<String> a1=new ArrayList<String>();
    a1.add("a");
    a1.add("b");
    a1.add("c");
    a1.add("d");
    System.out.println(a.equals(a1));
  }
}