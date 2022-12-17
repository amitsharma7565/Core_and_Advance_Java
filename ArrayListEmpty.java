// Write a Java program to empty an array list.
import java.util.*;
class ArrayListEmpty{
  public static void main(String args[]){
    ArrayList<String> a=new ArrayList<String>();
    a.add("Black");
    a.add("Red");
    a.add("Math");
    a.add("Science");
    System.out.println(a);
    a.removeAll(a);
    System.out.println(a);
  }
}