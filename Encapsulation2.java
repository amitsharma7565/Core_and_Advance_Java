import java.util.*;

class Product {
  private int pid;// instance
  private String pname;
  private int pqty;
  private int price;

  // setters and getters
  // assign the values to private variables
  // this is call the current class instance variable
  void setPid(int pid) {// local variable
    this.pid = pid;
  }

  void setPname(String pname) {
    this.pname = pname;
  }

  void setPqty(int pqty) {
    this.pqty = pqty;
  }

  void setPrice(int price) {
    this.price = price;
  }

  // getters
  int getPid() {
    return this.pid;
  }

  String getPname() {
    return this.pname;
  }

  int getPqty() {
    return this.pqty;
  }

  int getPrice() {
    return this.price;
  }

}

class Encapsulation2 {
  public static void main(String args[]) {
    Product p[] = new Product[2];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      p[i] = new Product();
      System.out.println("Enter product  details");
      p[i].setPid(sc.nextInt());
      sc.next();
      p[i].setPname(sc.next());
      p[i].setPqty(sc.nextInt());
      p[i].setPrice(sc.nextInt());
      System.out.print(p[i].getPid() + " " + p[i].getPname() + " " + p[i].getPqty() + " " + p[i].getPrice());

    }

  }
}