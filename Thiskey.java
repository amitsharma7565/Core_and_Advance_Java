class A {
  int i;

  A(int i) {
     this.i = i;
  }

  public void m() {
    System.out.println(i);
  }
}

class Thiskey {
  public static void main(String args[]) {
    A a = new A(6);
    a.m();
  }
}