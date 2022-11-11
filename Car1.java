// this is structure of class
class Car{
  // instance variable
  String brandName;
  int model;
  String name;
  long carNumber;
// instance method
  void carname(String name){
    System.out.println(name+" Name of the car");
  }
  void carNumber(long carNumber ){
    System.out.println(carNumber+" This is car number");
  }
} 
// this main class because main method add thats why its main class
class Car1{
  public static void main(String args[]){
    Car c=new Car();
    c.brandName="Tata";
    c.model=1998;
    c.name="Punch";
    c.carNumber=56789645L;
    System.out.println(c.brandName+" "+c.model+" "+" "+c.name+" "+c.carNumber+" ");
    c.carname(c.name);
    c.carNumber(c.carNumber);
  }
}