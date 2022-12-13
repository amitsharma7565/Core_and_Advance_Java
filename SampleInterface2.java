interface Drawable{
  void draw();
}
class Sample implements Drawable{
  public void draw(){
    System.out.println("drawing 1....");
  }
}
class Sample2 implements Drawable{
  public void draw(){
    System.out.println("drawing 2......");
  }
}

class SampleInterface2{
  public static void main(String args[]){
    Drawable d=new Sample();
    d.draw();
  }
}