class Product{
  int id;
  String name;
  String description;
  Product(int id,String name,String description){
    this.id=id;
    this.name=name;
    this.description=description;
  }
}

class LineItem{
  int id;
  int quantity;
  Product product;
  LineItem(int id,int quantity,Product product){
    this.id=id;
    this.quantity=quantity;
    this.product=product;
  }
}
class Product1{
  public static void main(String args[]){
    Product product1=new Product(1,"Mobile","Samsung S20 red color");
    Product product2=new Product(2,"Mobilecase","Samsung S20 white color");

    LineItem list1=new LineItem(1,4,product1);
     LineItem list2=new LineItem(2,5,product2);

    System.out.println(list1.id+" "+list1.quantity);
    System.out.println("****Product1 Informaation****");
    System.out.println(product1.id+" "+product1.name+" "+product1.description);
    
    
    
    
  }
}