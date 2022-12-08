import java.util.*;

class Fruit {
  private int id;
  private String fruitName;
  private int price;
  private int quantity;

  // setter
  public void setId(int id) {
    this.id = id;
  }

  public void setFruitName(String fruitName) {
    this.fruitName = fruitName;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  // getter
  public int getId() {
    return id;
  }

  public String getfruitName() {
    return fruitName;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}

class Fruits {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Fruit f = new Fruit();
    String s = sc.nextLine();
    String s1[] = new String[4];
    s1 = s.split(",");
    f.setId(Integer.parseInt(s1[0]));
    f.setFruitName(s1[1]);
    f.setPrice(Integer.parseInt(s1[2]));
    f.setQuantity(Integer.parseInt(s1[3]));

    System.out.println("Id is=" + f.getId());
    System.out.println("Fruit name is=" + f.getfruitName());
    System.out.println("Price is=" + f.getPrice());
    System.out.println("Quantity is=" + f.getQuantity());
  }
}

