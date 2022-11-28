// 6=1,2,3=6;
// 28=1,2,4,7,14=28
class Perfect{
  public static void main(String args[]){
    int n=6;
    int sum=0;
    for(int i=0;i<=n/2;i++){
      if(n%i==0){
        // sum=sum+i;
        sum+=i;
      }
    }
    if(n==sum){
      System.out.println("perfect number");
    }
    else{
      System.out.println("not perfect number");
    }
  }
}