// 4 type of method
// without return type and without parameters
// with return type and without parameters
// without return type and with parameters
// with return type and with parameter
class Area{
  //  without return type and without parameters.
  // static void area1(){
  //   int l=10;
  //   int b=20;
  //   int area=l*b;
  //   System.out.println(area);
  // }
  //  with return type and without parameters.
  // static int area1(){
  //   int l=10;
  //   int b=20;
  //   int area =l*b;
  //   return area;
  // }
  //  without return type and with parameters.
  // static void area1(int l,int b){
  //   int area=l*b;
  //   System.out.println(area);
  // }
  // with return type and with parameters.
  // static int area1(int l,int b){
  //   int area = l*b;
  //   return area;
  // }
  public static void main(String args[]){
    int result = area1(10,40);
    System.out.println(result);
  }
}