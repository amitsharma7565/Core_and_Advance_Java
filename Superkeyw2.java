class A {
  public void abc() {
    System.out.println("A class Method");
  }
}

class B extends A {
  public void abc() {
    super.abc();
    System.out.println("B class Method");
  }
}

class Superkeyw2 {
  public static void main(String args[]) {
    B b = new B();
    b.abc();
  }
}