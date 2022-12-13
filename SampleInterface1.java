interface abc{
  void run();
}
class Sample implements abc{
   public void run(){
    System.out.println("running...");
  }
}

class SampleInterface1{
  public static void main(String args[]){
   Sample i=new Sample();
    i.run();
  }
}

