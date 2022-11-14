// class product
//   name 
//   id
//     brand
//     quantity
//     quantity<10
//   order not taken
//   quality>10
//   order taken
// ------------------------------------
// class order
//     id
//     order day
//     order date
class Product {
  String productName;
  int productId;
  String productBrand;
  int quantity;

  void quantity(int quantity){
    if(quantity<10){
      System.out.println("order not taken");
    }
     else{
      System.out.println("order taken");
    }
    }
   
  }

class OrderProduct{
  public static void main(String args[]){
    Product p=new Product();
    p.productName="Jeans";
    p.productId=123;
    p.productBrand="Levis";
    int q=p.quantity=11;
    p.quantity(q);
  }
}
