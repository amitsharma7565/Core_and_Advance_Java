abstract class Ramesh{
  public void call(){
    System.out.println("calling...");
  }
  public abstract void capture();
  public abstract void move();
  public abstract void walk();
}
abstract class Suresh extends Ramesh{
  public void capture(){
    System.out.println("capturing...");
  }
}
class Amit extends Suresh{
  public void move(){
    System.out.println("moving...");
  }
  public void walk(){
    System.out.println("walking.....");
  }
}


class AbstractPhone{
  public static void main(String args[]){
    Amit s=new Amit();
    s.capture();
    s.move();
    s.walk();
    s.call();
  }
}