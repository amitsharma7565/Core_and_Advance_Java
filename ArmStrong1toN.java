
class ArmStrong1toN{
  public static void main(String args[]){
    int num=153;
    int temp=num;
  
    int count=0;
    int sum=0;
    while(num>0){
      int rem=num%10;
      count++;
      num=num/10;
    }
    System.out.println("power is "+count);
    while(temp>0){
      int rem2=temp%10;
      sum+=Math.pow(rem2,count);
      temp=temp/10;
    }
    System.out.println(sum);
  }
}