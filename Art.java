class A{
  int a=10;
  int b=11;
  int c=a+b;
  void displaya(){
    System.out.println(c);
  }
}
class B{
  int v=10;
  int n=11;
  int m=n-v;
  void displayb(){
    System.out.println(m);
  }
}
class C{
  int v=10;
  int n=100;
  int m=n/v;
  void displayc(){
    System.out.println(m);
  }
}
class D{
  int v=10;
  int n=100;
  int m=n*v;
  void displayd(){
    System.out.println(m);
  }
}
class Art{
  public static void main(String args[]){
    A a=new A();
    B b=new B();
    C c=new C();
    D d=new D();
    a.displaya();
    b.displayb();
    c.displayc();
    d.displayd();
  }
}