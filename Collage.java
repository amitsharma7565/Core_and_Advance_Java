// Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
//  It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a 
// method with the same name that prints "I am an Undergraduate" and "I am a 
// Postgraduate" respectively. Call the method by creating an object of each of the 
// three classes.

class Degree{
  void getDegree(){
    System.out.println("I got a degree");
  }
}
class Undergraduate extends Degree{
   void getDegree(){
    System.out.println("I am an Undergraduate");
  }
}
class Postgraduate extends Degree{
   void getDegree(){
    System.out.println("I am an Postgraduate");
  }
}

class Collage{
  public static void main(String args[]){
    Degree d=new Degree();
    Undergraduate u= new Undergraduate();
    Postgraduate p=new Postgraduate();
    d.getDegree();
    u.getDegree();
    p.getDegree();
  }
}
