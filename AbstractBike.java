abstract class AbstractBikes{
  AbstractBikes(){
    // System.out.println("Bike");
  }
  abstract void run();
  void changeGear(){
    System.out.println("Change the gear");
  }
}
class Honda extends AbstractBikes{
  void run(){
    System.out.println("run safely");
  }
}

class AbstractBike{
  public static void main(String args[]){
    AbstractBikes h=new Honda();
    h.run();
    h.changeGear();
  }
}