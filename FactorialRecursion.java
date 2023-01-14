class FactorialRecursion{
  public static void main(String args[]){
    int result =fact(5);
    System.out.println(result);
  }
  public static int fact(int n){ //5//4
    if(n==1){
      return 1;
    }
    else{
      return(n*fact(n-1));// 5*(4)*(3)
    }
  }
}