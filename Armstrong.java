import java.util.*;
class Armstrong{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();//160
    int count,sum=0,temp,rem;
    for(int i=1;i<=n;i++){ //1<=160
       count=0;
       temp=i;//temp=123....160
    while(temp>0){//(1,2,3...160>0)
      temp=temp/10;//remove the lastdigit
      count++;//count digit
    }
    temp=i;//temp=1,2,3...160
    
    while(temp>0){
      rem=temp%10;// to get the last digit
      sum=sum+(int)(Math.pow(rem,count)); //0+rem^digit in number
      temp=temp/10;//remove the last digit
    }
    if(sum==i){ 
      System.out.println(sum);
    }
    sum=0;
   
    }
  }
}
  