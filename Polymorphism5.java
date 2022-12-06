// overloading or compile time or static method
class A{
  public void amit(){
    System.out.println("A.amit()");
  }
    public void amit(int i){
    System.out.println("A.amit(i)");
  }
    public void amit(String j){
    System.out.println("A.amit(j)");
  }
    public void amit(String k ,int l){
    System.out.println("A.amit(k,l)");
  }
}
class Polymorphism5{
  public static void main(String args[]){
  A a=new A();
    a.amit();
  }
}