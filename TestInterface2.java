class TestInterface2{
  public static void main(String args[]){
    abc a=new Sample();
    a.print();
    a.print();
  }
}
interface abc{
  void print();
}
interface def{
  void print();
}
class Sample implements abc,def{
  public void print(){
    System.out.println("abcdsd");
  }
}



