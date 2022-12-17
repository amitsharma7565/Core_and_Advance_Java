// Write a Java program to test an array list is empty or not.
import java.util.*;
class ArrayListEmpty2{
  public static void main(String args[]){
    ArrayList<String>a=new ArrayList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    // remove all the element
    // a.removeAll(a);
    // check by using conditions
        if(a.isEmpty()){
        System.out.println("Empty");
      }
      else{
        System.out.println("Not empty");
      }
    }

    }

