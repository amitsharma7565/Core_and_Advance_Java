// comparator 
import java.util.*;
class Product{
  int id;
  String name;
  int quantity;
  // constructor
  Product(int id, String name, int quantity){
    this.id=id;
    this.name=name;
    this.quantity=quantity;
  }
}
// based on id(integer)
class IdComparator implements Comparator<Product>{
  // method
  public int compare(Product p1, Product p2){
    if(p1.id==p2.id){
      return 0;
    }
    else if(p1.id>p2.id){
      return 1;
    }
    else{
      return -1;
    }
  }
}
// based on name (String)
class NameComparator implements Comparator<Product>{
  public int compare(Product p1, Product p2){
    return p1.name.compareTo(p2.name);
  }
}

// main class and method
class ProductShortComparator{
  public static void main(String args[]){
    ArrayList<Product>list=new ArrayList<Product>();
    list.add(new Product(1,"maruti",2));
    list.add(new Product(3,"Honda",3));
    list.add(new Product(2,"Audi",6));
    Collections.sort(list,new IdComparator());
    System.out.println("Based on id ");
    for(Product obj:list){
      System.out.println(obj.id+" "+obj.name+" "+obj.quantity);
    }
    Collections.sort(list,new NameComparator());
    System.out.println("Based on name ");
    for(Product obj:list){
      System.out.println(obj.id+" "+obj.name+" "+obj.quantity);
    }
  }
}