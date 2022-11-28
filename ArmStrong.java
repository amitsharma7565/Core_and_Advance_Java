// 153=1*1*1+5*5*5+3*3*3;
// 370=3*3*3+7*7*7+0*0*0;
class ArmStrong{
  public static void main(String args[]){
    int n=373;
    int sum=0;
    int r;
    int temp=n;
    while(n>0){
          r=n%10;
    n=n/10;
    sum=sum+r*r*r;
    }
  if(sum==temp){
    System.out.println("armstrong number");
  }
    else{
      System.out.println("not armstrong number");
    }
  }
  
}