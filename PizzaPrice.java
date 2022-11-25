class Pizza {
  private String size;
  private int cheeseToppings;
  private int pepperoniToppings;
  private int hamToppings;
  
  // Constructor(s) that set all of the instance variables.
  Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
    this.size = size;
    this.cheeseToppings = cheeseToppings;
    this.pepperoniToppings = pepperoniToppings;
    this.hamToppings = hamToppings;
  }

  // setter
  void setSize(String size) {
    this.size = size;
  }

  void setcheeseToppings(int cheeseToppings) {
    this.cheeseToppings = cheeseToppings;
  }

  void setpepperoniToppings(int pepperoniToppings) {
    this.pepperoniToppings = pepperoniToppings;
  }

  void sethamToppings(int hamToppings) {
    this.hamToppings = hamToppings;
  }

  // getter
  String getSize() {
    return size;
  }

  int getcheeseToppings() {
    return cheeseToppings;
  }

  int getpepperoniToppings() {
    return pepperoniToppings;
  }

  int gethamToppings() {
    return hamToppings;
  }

  // method
  double calcCost() {
    if (size.equals("small")) {
      return 10 + (cheeseToppings + pepperoniToppings + hamToppings) * 2;
    } else if (size.equals("medium")) {
      return 12 + (cheeseToppings + pepperoniToppings + hamToppings) * 2;
    } else if (size.equals("large")) {
      return 14 + (cheeseToppings + pepperoniToppings + hamToppings) * 2;
    } else {
      return 0.0;
    }
  }

  public String getDescription() {
    return "Size: " + size + " Quality of Cheese toppings: " + cheeseToppings + " Quality of Pepperoni toppings: "
        + pepperoniToppings + " Quality of Ham toppings: " + hamToppings +calcCost();
  }
}
// main class
class PizzaPrice {
  // main method
  public static void main(String[] args) {
    Pizza pz1 = new Pizza("large", 2, 4, 8);
    Pizza pz2 = new Pizza("small", 9, 7, 5);
    Pizza pz3 = new Pizza("medium", 2, 9, 4);
    // call the method
    System.out.println(pz1.getDescription());
    System.out.println(pz2.getDescription());
    System.out.println(pz3.getDescription());
  }
}
