// 4 type of method
// without return type and without parameters
// with return type and without parameters
// without return type and with parameters
// with return type and with parameter

class Perfect2{
  static void perfect(){
    int num=24,sum=0;
    for(int i=1;i<=num/2;i++){
      if(num%i==0){
        sum=sum+i;
      }
    }
    if(sum==num){
      System.out.println("perfect number");
    }
    else{
      System.out.println("not perfect number");
    }
  }
  public static void main (String args[]){
    perfect();
  }
}