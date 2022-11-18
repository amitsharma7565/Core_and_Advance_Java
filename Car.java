class Vehicle{
  void run(){
    System.out.println("Vehicle is running");
  }
}
class Bike extends Vehicle{
  //overriding
  void run(){
    System.out.println("Bike is running");
  }
}

class Car{
  public static void main(String args[]){
    Bike b=new Bike();
    b.run();
  }
}