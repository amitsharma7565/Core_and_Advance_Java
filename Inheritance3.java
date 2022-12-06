class A{
  public A(){
    System.out.println("A class");
  }
  public A(int i){
    System.out.println("A int");
  }
}
class B extends A {
  public B(){
    System.out.println("b class ");
  }
  B(int i){
    System.out.println("class B int");
  }
}

class Inheritance3{
  public static void main(String args[]){
    B a=new B();
  }
}

