// ArmStrong nuber= 153= 1^3+5^3+3^3=153

class ArmStrongNumber{
  public static void main(String args[]){
    int num=163;
    int temp=num;
    int sum=0;
    int count=0;
    while(num>0){
      num=num/10;
      count++;
    }
   
   num=temp;

    while(num>0){
      int rem=num%10;
      sum+=(Math.pow(rem,count));
      num=num/10;
    }
  

    if(sum==temp){
      System.out.println("ArmStrong number");
    }
    else{
      System.out.println("NOt a Armstrong number");
    }
  }
}