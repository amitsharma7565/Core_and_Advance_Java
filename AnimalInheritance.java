/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/
//Add Animal class and Create Sound() method 

class Animal {

  public void makeSound() {
    System.out.println("The animal makes a sound");
  }
}

// Add Horse class that extends Animal class
class Horse extends Animal {
  public void makeSound() {
    System.out.println("The horse says: wee wee ");
  }
}

// Add Cat class that extends Animal class
class Cat extends Animal {
  public void makeSound() {
    System.out.println("The cat says: meow meow ");
  }
}

public class AnimalInheritance {

  // Add main method here
  public static void main(String args[]) {
    // Create all 3 Animal objects and add to an array
    Animal myAnimal = new Animal();
    Animal myHorse = new Horse();
    Animal myCat = new Cat();
    myAnimal.makeSound();
    myHorse.makeSound();
    myCat.makeSound();
  }
}
