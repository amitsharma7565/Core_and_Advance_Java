interface Printable {
  void print();
}

interface Showable extends Printable {
  void show();
}

class Sample implements Showable {
  public void print(){
    System.out.println("print...");
  }
  public void show(){
    System.out.println("Show...");
  }
}

// main class 
class SampleInterface4{
  public static void main(String args[]){
    Sample s=new Sample();
    s.print();
    s.show();
  }
}
