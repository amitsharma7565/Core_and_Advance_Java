// Write a Java program to insert an element into the array list at the first position
import java.util.*;
class ArrayList8Product{
  public static void main(String args[]){
    ArrayList<Integer> a=new ArrayList <Integer>();
    a.add(1);
    a.add(5);
    a.add(9);
    a.add(10);
    a.set(0,11);
    System.out.println(a);
  }
}
