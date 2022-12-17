// Write a Java program to print all the elements of a ArrayList using the position of the elements
import java.util.*;
class ArrayListPostions{
  public static void main(String args[]){
    ArrayList<String>a=new ArrayList<String>();
    a.add("pen");
    a.add("mobile");
    a.add("bike");
    a.add("car");
    for(Object obj:a){
      System.out.println(obj);
    }
  }
}