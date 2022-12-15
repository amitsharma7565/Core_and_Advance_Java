import java.util.*;
class ArrayListCustomer17{
  public static void main(String args[]){
    Customer c1=new Customer("Amit1","HP",25);
    Customer c2=new Customer("Amit2","HP1",26);
    Customer c3=new Customer("Amit3","HP2",27);
    Customer c4=new Customer("Amit4","HP3",28);
    Customer c5=new Customer("Amit5","HP4",29);
    // Store in arrayList
    ArrayList<Customer> a=new ArrayList<Customer>();
    a.add(c1);
    a.add(c2);
    a.add(c3);
    a.add(c4);
    a.add(c5);
    for(Customer obj:a){
      System.out.println(obj.getAddress()+" "+ obj.getName()+" "+obj.getAge());
    }
  }
}




class Customer{
  private String name;
  private String address;
  private int age;
  // setter
  public void setName(String name){
    this.name=name;
  }
   public void setAddress(String address){
    this.address=address;
  }
   public void setAge(int age){
    this.age=age;
  }
  // getter
   public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public int getAge(){
    return age;
  }
  // constructor
  Customer(String name,String address, int age){
    this.name=name;
    this.address=address;
    this.age=age;
  }
}
