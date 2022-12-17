// Write a Java program of swap two elements in an array list.

import java.util.*;
class ArrayListSwap{
  public static void main(String args[]){
    ArrayList<String> a=new ArrayList<String>();
    a.add("Balck");
    a.add("red");
    a.add("Green");
    a.add("Blue");
    System.out.println(a);
    Collections.swap(a,0,2);
    System.out.println(a);
  }
}