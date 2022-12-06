class Bike{
  int speed(){
    return 150;
  }
}
class Bike2 extends Bike{
  int speed(){
    return 180;
  }
}


class Polymorphism2{
  public static void main(String args[]){
    Bike b=new Bike2();
   
    System.out.println(b.speed());
     b=new Bike();
    System.out.println(b.speed());
  }
}