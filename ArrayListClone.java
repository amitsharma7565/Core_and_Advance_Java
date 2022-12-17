// Clone an array list to another array list

import java.util.*;
class ArrayListClone{
  public static void main(String args[]){
    ArrayList<Integer>a=new ArrayList<Integer>();
    a.add(1);
    a.add(12);
    a.add(13);
    a.add(20);
    ArrayList<Integer>a1=new ArrayList<Integer>();
    a1=(ArrayList<Integer>)a.clone();
    System.out.println(a1);
  }
}
