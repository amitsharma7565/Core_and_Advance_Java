// create a class name movie, display any three movie name;
class Movie{
  void display(){
    System.out.println("Hello");
  }
}
class Movie2 extends Movie{
  void display(){
    System.out.println("abc,ryt,edf");
    // super.display();
  }
}
class Overriding{
  public static void main(String args[]){
    Movie m=new Movie();
    m.display();
  }
}