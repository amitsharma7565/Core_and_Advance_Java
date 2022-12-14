class SampleInterface3{
  public static void main(String args[]){
    abcd a=new Sample();
    a.show();
    a.print();
  }
}

interface abc{
  void print();
}
interface abcd extends abc{
  void show();
}

class Sample implements abcd{
  public void print(){
    System.out.println("print");
  }
  public void show(){
    System.out.println("show");
  }
}