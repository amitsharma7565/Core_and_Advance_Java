// area of traiangle
// 4 type of method
// without return type and without parameters
// with return type and without parameters
// without return type and with parameters
// with return type and with parameter
//  without return type and without parameters.
void area1(){
  int l=10;
  int b=20;
  int area=l*b;
  System.out.println(area);
}
//  with return type and without parameters.
int area1(){
  int l=10;
  int b=20;
  int area=l*b;
  return area;
}
//  without return type and with parameters.
void area1(int l,int b){
  int area=l*b;
  System.out.println(area);
}
// with return type and with parameters.
int area1(int l,int b){
  int area=l*b;
  return area;
}

