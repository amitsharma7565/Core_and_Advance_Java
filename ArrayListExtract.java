// Write a Java program to extract a portion of a array list

import java.util.*;
class ArrayListExtract{
  public static void main(String args[]){
    ArrayList<String> a=new ArrayList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    System.out.println(a.subList(0, 3));
  }
}