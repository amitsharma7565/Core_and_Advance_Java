// 1.Write a Java program that demonstrates the use of polymorphism by creating a base class "Shape" and two derived classes "Rectangle" and "Circle", and a method to calculate the area of the shape.

class Shape {
  public void area() {
    System.out.println("This is Parent class");
  }
}

class Reactange extends Shape {
  public void area() {
    int l = 10;
    int b = 10;
    int area = l * b;
    System.out.println("The area of Reactangle is: " + area);
  }
}

class Circle extends Shape {
  public void area() {
    int r = 10;
    double area = (3.14 * r * r);
    System.out.println("The area of circle is :" + area);
  }
}

class ShapePolymorphism{
  public static void main(String args[]){
    Shape s;
    s=new Reactange();
    s.area();
    s=new Circle();
    s.area();
  }
}