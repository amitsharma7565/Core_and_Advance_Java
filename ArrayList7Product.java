// Write a Java program to iterate through all elements in a array list
import java.util.*;
class ArrayList7Product{
  public static void main(String args[]){
    ArrayList<Integer>a=new ArrayList<Integer>();
    a.add(1);
    a.add(3);
    a.add(6);
    a.add(8);
    // System.out.println(a);
    // iterate
    Iterator itr=a.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}