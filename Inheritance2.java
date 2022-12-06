class Animal{
  public void eat(){
    System.out.println("eating");
  }
}

class Cat extends Animal{
  public void meaw(){
    System.out.println("meow");
  }
}

class Dog extends Animal{
  public void bark(){
    System.out.println("Barking");
  }
}

class Inheritance2{
  public static void main(String args[]){
    Cat c= new Cat();
    Dog d=new Dog();
    c.eat();
    c.meaw();
    d.bark();
    d.eat();
  }
}