// multiple interface
interface amit{
  void run();
}
interface palak{
  void run(int a);
}

class Sample implements amit,palak{
  public void run(){
    System.out.println("run1...");
  }
  public void run(int a){
    System.out.println("run2..");
  }
}

class MultipleInterface{
  public static void main(String args[]){
    Sample s=new Sample();
    s.run();
    s.run(12);
  }
}