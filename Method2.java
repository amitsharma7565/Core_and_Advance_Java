// swap of two number;
// 4 type of method
// without return type and without parameters
// with return type and without parameters
// without return type and with parameters
// with return type and with parameter
1. //  without return type and without parameters.
  void swap(){
  int x=10;
  int y=11;
  int temp=x;
  int x=y;
  int y=temp;
  System.out.println(x+" "+y);
  }
//  with return type and without parameters.
int swap(){
  int x=10;
  int y=11;
  int temp=x;
  int x=y;
  int y=temp;
  return x,y
}
// without return type and with parameters.
void swap(int x,int y){
  int temp =x;
  int x=y;
  int y=temp;
  System.out.println(x+" "+y);
}
//  with return type and with parameters.
int swap(int x,int y){
  int temp =x;
  int x=y;
  int y=temp;
  return x,y;
}
