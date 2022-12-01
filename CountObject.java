class A{
   static int i;
  //constructor
  A(){
    i++;
  }
  void count(){
    System.out.println(i);
  }
}
class CountObject{
  public static void main(String args[]){
    A a=new A();
    A b=new A();
    A c=new A();
    a.count();
  }
}