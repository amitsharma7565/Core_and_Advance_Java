interface abc{
  default void run(){
    System.out.println("running...");
  }
}
class Sample implements abc{
  public void start(){
    System.out.println("Starting...");
  }
}


class SampleInterface5{
  public static void main(String args[]){
    Sample s=new Sample();
    s.run();
    s.start();
  }
}