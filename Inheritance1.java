// multilevelInheritance
class A{
  public void eat(){
    System.out.println("eating");
  }
}
class B extends A {
  public void grass(){
    System.out.println("grassing");
  }
}
class C extends B{
  public void frass(){
    System.out.println("frassing");
  }
}

class Inheritance1{
  public static void main(String args[]){
    C c=new C();
    c.eat();
    c.frass();
    c.grass();
  }
}