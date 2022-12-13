interface abc{
  static void run(){
    System.out.println("Running..");
  }
}
class Sample implements abc{
  public void show(){
    System.out.println("Showwing..");
  }
}





class SampleInterface6{
  public static void main(String args[]){
    Sample s=new Sample();
    s.show();
    abc.run();
  }
}