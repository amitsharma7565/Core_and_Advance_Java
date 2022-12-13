// Shape
//color
//    area(){
//"area of shape"
    // }
 
//   rectangle extends from shape
      // l,b
       //  area()
         
 
//   Circle 
       //  area
//   Square
       //  area
//   Triangle
      //   area

class Shape1{
  private String colour;
  // setter
  public void setColour(String colour){
    this.colour=colour;
  }
  // getter
  public String getColour(){
    return colour;
  }
  public void area(){
    System.out.println("Area of shape");
  }
}
// for Rectangle
class Rectangle extends Shape{
  private int length;
  private int breadth;
  // constructor
  Rectangle(int length, int breadth){
    this.length=length;
    this.breadth=breadth;
  }
  // setter
  public void setLength(int length){
    this.length=length;
  }
  public void setBreadth(int breadth){
    this.breadth=breadth;
  }
  // getter
  public int getLength(){
    return length;
  }
  public int getBreadth(){
    return breadth;
  }
  public void  area(){
    System.out.println(length*breadth);
  }
}
// for circle
class Circle extends Shape{
  private float radius;
  // constructor
  Circle(float radius){
    this.radius=radius;
  }
  // setter
  public void setRadius(float radius){
    this.radius=radius;
  }
  // getter
  public float getRadius(){
    return radius;
  }
  // method to print the area of cirlcle
  public void area(){
    System.out.println((3.14*radius*radius));
  }
}
// for square
class Square extends Shape{
  private int side;
  // constructor
  Square(int side){
    this.side=side;
  }
  // setter
  public void setSide(int side){
    this.side=side;
  }
  // getter
  public int getSide(){
    return side;
  }
  // area
  public void area(){
    System.out.println((side*side));
  }
}
// for triangle
class Triangle extends Shape{
  private int height;
  private int base;
  // constructor
  Triangle(int height, int base){
    this.height=height;
    this.base=base;
  }
  // setter
  public void setHeight(int height){
    this.height=height;
  }
  public void setBase(int base){
    this.base=base;
  }
  // getter
  public int getHeight(){
    return height;
  }
   public int getBase(){
    return base;
  }
  public void area(){
    System.out.println((height*base)/2);
  }
}

// main class 
class Shape{
  public static void main(String args[]){
    Shape1 s=new Shape1();
    s.area();
    Rectangle r=new Rectangle(7,5);
    r.area();
  }
}
