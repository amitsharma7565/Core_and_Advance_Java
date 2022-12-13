// Create a class to print the area of a square and a rectangle. The class has two methods with the same name but 
// different number of parameters. The method for printing area of rectangle has two parameters which are length and 
// breadth respetively while the other method for printing area of square has one parameter which is side of square.*/
class Area{
  public static  void area(int l,int b){
    System.out.println("Area of Rectangle is "+(l*b));
  }
  public static void area(int side){
    System.out.println("Side of Square is "+(side*side));
  }
}

class PolymorphismArea{
  public static void main(String args[]){
    Area.area(20);
  }

}