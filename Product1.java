import java.util.*;
class Product{
  int id;
  String name;
  int price;
  int quantity;

  // constructor
  Product(int id, String name, int price, int quantity){
    this.id=id;
    this.name=name;
    this.price=price;
    this.quantity=quantity;
  }
}
// interface
interface ProductData{
  public void insert(ArrayList<Product> p);
  public void display(ArrayList<Product> p);
  public void update(ArrayList<Product> p ,int id);
  public void search(ArrayList<Product> p ,int id);
  public void delete(ArrayList<Product> p ,int id);
  public void viewPoints();
}


class ProductImpl implements ProductData{
  public void viewPoints(){
    System.out.println("0 for Exit");
    System.out.println("1 for insert");
    System.out.println("2 for display");
    System.out.println("3 for update");
    System.out.println("4 for search");
    System.out.println("5 for delete");
    
  }
  public void insert(ArrayList<Product> p){

    p.add(new Product(1,"iphone",90000,2));
    p.add(new Product(2,"redmi",20000,3));
    // if(p.isEmpty()){
    //   System.out.println("not inserted");
    // }
    // else{
    //   System.out.println("Inserted");
    // }
  }
  // Display method define
  public void display(ArrayList<Product> p){
    for(Product obj:p){
      System.out.println(obj.id+" "+obj.name+" "+ obj.price+" "+obj.quantity);
    }
  }
  // Update method define
  public void update(ArrayList<Product> p ,int id){
    for(Product obj:p){
      if(obj.id==id){
        obj.name="LG";
      }
      System.out.println(obj.name);
    }
  }
  // Search method define
  public void search(ArrayList<Product> p ,int id){
    for(Product obj:p){
      if(obj.id==id){
        System.out.println(obj.id+" "+obj.name+" "+ obj.price+" "+obj.quantity);
      }
    }
  }
  // delete
  public void delete(ArrayList<Product> p ,int id){
    Product pro=null;
    for(Product obj:p){
      if(obj.id==id){
        pro=obj;
      }
      p.remove(pro);
    System.out.println("delete sucessfully");
    }
   
  }
}

// main 
class Product1{
  public static void main(String args[]){
    ProductData pi=new ProductImpl();
    ArrayList<Product> list= new ArrayList<Product>();
     int num=0;
    do{
      System.out.println("choose the options");
      pi.viewPoints();
      Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
      if(num==1){
        pi.insert(list);
      }
      else if(num==2){
        pi.display(list);
      }
      else if(num==3){
        pi.update(list, 1);
      }
      else if(num==4){
        pi.search(list,1);
      }
      else if(num==5){
        pi.delete(list, 2);
      }
      else if(num==0){
        System.out.println("Thanks for visit");
      }
    }while(num!=0);
  }
}