class Bike{
  int speed=150;
}
class Car extends Bike{
  // int speed=180;
}


class Polymorphism4{
  public static void main(String args[]){
    Car c=new Car();
    System.out.println(c.speed);
  }
}