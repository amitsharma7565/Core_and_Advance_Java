/*Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named
'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This
 is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a
rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
class Shape{
  void print_Shape(){
    System.out.println("This is This is shape");
  }
}
class Rectangle3 extends Shape{
  void print_Rectangle(){
   System.out.println("This is rectangluar shape");
}
}
class Circle extends Shape{
  void print_Circle(){
  System.out.println("This is circular shape");
}
}
class Square1 extends Rectangle3{
  void print(){
    System.out.println("Square is a rectangle");
}
}
class Shape1{
  public static void main(String args[]){
    Square1 s=new Square1();
    s.print_Shape();
    s.print_Rectangle();
    s.print();
  }
}