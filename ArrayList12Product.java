// Write a Java program to search an element in a array list
import java.util.*;
class ArrayList12Product{
  public static void main(String args[]){
    ArrayList a=new ArrayList();
    a.add("amit");
    a.add(9);
    a.add("Sharma");
    // System.out.println(a);
    if(a.contains("Sharma")){
      System.out.println("Item found");
    }
    else{
      System.out.println("Item not found");
    }
  }
}