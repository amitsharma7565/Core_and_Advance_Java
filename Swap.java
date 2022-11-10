// 4 type of method
// without return type and without parameters
// with return type and without parameters
// without return type and with parameters
// with return type and with parameter

class Swap{
  //  without return type and without parameters.
  // static void swap(){
  //   int x=10;
  //   int y=20;
  //   int temp=x;
  //    x=y;
  //    y=temp;
  //   System.out.println(x+" "+y);
  // }
  // with return type and with parameters.
  static void swap(int x,int y){
    int temp=x;
    x=y;
    y=temp;
    System.out.println(x+" "+y);
  }
  public static void main(String args[]){
    swap(10,20);
  }
}