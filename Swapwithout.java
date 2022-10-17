class Swapwithout {
  public static void main(String args[]) {
    int a, b;
    a = 11;
    b = 10;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println(a);
    System.out.println(b);
  }
}