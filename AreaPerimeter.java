/* JFM1T10_Assignment3:

Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/

import java.util.Scanner;

abstract class Shape {
  private double height;
  private double width;

  abstract void area();

  abstract void perimeter();

  void setHeight(double h) {
    this.height = h;

  }

  void setWidth(double w) {

    this.width = w;
  }

  double getHeight() {
    return this.height;
  }

  double getWidth() {
    return this.width;
  }
}

// Add Square class that extends Shape class
class Square extends Shape {
  void area() {
    double a = getWidth() * getWidth();
    System.out.println("area of a square is: " + a);
  }

  void perimeter() {
    double p = 4 * getWidth();
    System.out.println("perimeter of a square is: " + p);
  }
}

// Add Rectangle class that extends Shape class
class Rectangle extends Shape {
  void area() {
    double a = getHeight() * getWidth();
    System.out.println("area of a rectangle is: " + a);
  }

  void perimeter() {
    double p = 2 * (getHeight() + getWidth());
    System.out.println("perimeter of a rectangle is: " + p);
  }

}

// Add EquilateralTriangle class that extends Shape class
class EquilateralTriangle extends Shape {
  void area() {
    double a = getHeight() * getHeight() * (Math.sqrt(3) / 4);

    System.out.println("area of a equilateral triangle is: " + a);
  }

  void perimeter() {
    double p = 3 * getHeight();
    System.out.println("perimeter of a eqilateral triangle is: " + p);
  }

}

class AreaPerimeter {

  // Add the main method here and find Area and Perimeter
  public static void main(String arg[]) {

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the height of triangle");
    Shape shape;
    EquilateralTriangle triangle = new EquilateralTriangle();
    shape = triangle;
    triangle.setHeight(s.nextDouble());

    System.out.println("Enter the width of rectangle");
    Rectangle rectangle = new Rectangle();
    shape = rectangle;
    rectangle.setWidth(s.nextDouble());
    System.out.println("Enter the height of rectangle");
    rectangle.setHeight(s.nextDouble());

    System.out.println("Enter the width of square");
    Square square = new Square();
    shape = square;
    square.setWidth(s.nextDouble());

    System.out.println("<<<<<EquilateralTriangle Details>>>>>>");
    triangle.area();
    triangle.perimeter();
    System.out.println();

    System.out.println("<<<<<Rectangle Details>>>>>>");
    rectangle.area();
    rectangle.perimeter();
    System.out.println();

    System.out.println("<<<<<Square Details>>>>>>");
    square.area();
    square.perimeter();
    System.out.println();
  }
}