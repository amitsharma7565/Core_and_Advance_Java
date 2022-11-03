import java.util.*;
class PerfectH{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int n=sc.nextInt();
    int sum;
    for(int i=1;i<=n;i++)
      {
       int j=1;
        sum=0;
         while(j<=i/2){
            if(i%j==0){
             sum=sum+j;
            }
            j++;
          }
         if(sum==i)
          {
             System.out.println(i);
          }
   
       }

    }
  }