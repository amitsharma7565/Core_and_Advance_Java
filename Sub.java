//multiple methods have same name with dfferent parameters(Method overloading)

// overloading
class Subtraction{
// instance methd 
  void sub(int a,int b){
    System.out.println("sub is"+(a-b));
  }
  void sub(int a,int b, int c){
    System.out.println("sub iss"+(a-b-c));
  }
    void sub(int a,double b){
    System.out.println("sub isss"+(a-b));
  }
}
class Sub{
  public static void main(String args[]){
    Subtraction s=new Subtraction();
    s.sub(20,19);
    s.sub(22,22.3);
    s.sub(22,34,22);
  }
}