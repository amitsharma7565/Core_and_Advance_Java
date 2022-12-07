class A {
  A() {
    System.out.println(" Default A");
  }
  A(int i){
    System.out.println("Para of A");
  }

  public void a() {
    System.out.println("A method");
  }
}

class B extends A {
  B() {
    System.out.println("Default B");
  }
  B(int i){
    super(i);
    System.out.println("para of B");
  }

  public void b() {
    System.out.println("B method");
  }
}

class Superkeyw {
  public static void main(String args[]) {
    B b = new B(4);
  }
}