// Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.
class Degree{
  public void getDegree(){
    System.out.println("I got a degree");
  }
}
class Undergraduate extends Degree{
  public void getDegree(){
    System.out.println("i am an undergraduate");
  }
}
class Postgraduate extends Degree{
    public void getDegree(){
    System.out.println("i am an Postgraduate");
  }
}

class Colleage{
  public static void main(String args[]){
    Degree d=new Degree();
    d.getDegree();
    Undergraduate u=new Undergraduate();
    u.getDegree();
    Postgraduate p=new Postgraduate();
    p.getDegree();
  }
}