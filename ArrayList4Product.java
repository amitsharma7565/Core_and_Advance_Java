import java.util.*;
class Product{
  private int pid;//instance 
  private String pname;
  private int pqty;
  private int price;
  //setters and getters
  //assign the values to private variables
//this is call the current class instance variable
  void setPid(int pid){//local variable
   this.pid=pid;
  }
  void setPname(String pname){
    this.pname=pname;
  }
  void setPqty(int pqty){
    this.pqty=pqty;
  }
  void setPrice(int price){
    this.price=price;
  }
    //getters
  int getPid(){
    return this.pid;
  }
  String getPname(){
    return this.pname;
  }
  int getPqty(){
    return this.pqty;
  }
  int getPrice(){
    return this.price;
  }
  //constructor name should be same as class name
  //we should not declare constructor with any keyords like final static abstract
  //It looks like a method but it doest not return any value
 
  Product(){
    System.out.println("Constructor called");
  }
  Product(int pid,String pname,int pqty,int price){
    this.pid=pid;
    this.pname=pname;
    this.pqty=pqty;
    this.price=price;
  }
  Product(int pid){
    this.pid=pid;
  }
  Product(int pid,String pname){
    this.pid=pid;
    this.pname=pname;
  }
 
}
 
class ArrayList4Product{
  public static void main(String args[]) {
  Product p1=new Product(123,"apple",23,200);
  Product p2=new Product(145);
  Product p3=new Product(123,"Banana",23,200);
Product p4=new Product(123,"Orange",23,200);
    ArrayList<Product> list=new ArrayList<Product>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
 
    for(Product p:list)
      {
        System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPqty()+" "+p.getPrice());
      }
 
  }
}