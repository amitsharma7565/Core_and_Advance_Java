 
// Write a Java program to increase the size of an array list
import java.util.*;
class ArrayListIncearse{
  public static void main(String args[]){
  ArrayList<String> a =new ArrayList<String>();
    a.add("css");
    a.add("html");
    a.add("python");
    a.add("c++");
    System.out.println(a);
    a.ensureCapacity(8);
    a.add("add");
    a.add("sub");
     a.add("add");
    a.add("sub");
     a.add("add");
    a.add("sub");
    System.out.println(a);
}
}