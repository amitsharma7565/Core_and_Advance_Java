class Recursion1{
  public static void main(String args[]){
    int result=num(2);
    System.out.println(result);
  }
  public static int num(int k){
    if(k>0){
  return k+num(k-1);
  }
  else{
  return 0;
}
}
}