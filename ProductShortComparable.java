// collections--comparable & Comparator

// Product class 
// use comparable
import java.util.*;
class Product implements Comparable<Product>{
  int id;
  String name;
  int quantity;
  // constructor
  Product(int id,String name, int quantity){
    this.id=id;
    this.name=name;
    this.quantity=quantity;
  }
  // comparable method based on id
  // public int compareTo(Product p1){
  //   if(id==p1.id){
  //     return 0;
  //   }
  //   else if(id>p1.id){
  //     return 1;
  //   }
  //   else {
  //     return -1;
  //   }
  // }
  // compareTo method based on String 
  public int compareTo(Product p1){
    return name.compareTo(p1.name);
  }
}

// main class and method
class ProductShortComparable{
  public static void main(String args[]){
    ArrayList<Product>list=new ArrayList<Product>();
    list.add(new Product(1,"Pen",2));
    list.add(new Product(5,"GreenPen",2));
    list.add(new Product(2,"BluePen",2));
    list.add(new Product(3,"RedPen",2));
    Collections.sort(list);
    for(Product obj:list){
      System.out.println(obj.id+" "+obj.name+" "+obj.quantity);
    }
  }
}