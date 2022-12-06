class Animal {
  public void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("eating2");
  }
}

class Cat extends Dog {
  public void eat() {
    System.out.println("eating3");
  }
}

class Polymorphism3 {
  public static void main(String args[]) {
    Animal c = new Cat();
    c.eat();
    // Dog d = new Dog();
    // d.eat();
  
  }
}