
class A{
  public void show(){
    System.out.println("A Show");
  }
}

class AnonymousObject{
  public static void main(String args[]){
    // A a=new A();
    // anomymousObject
    new A().show();
  }
}