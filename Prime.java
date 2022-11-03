import java.util.*;
class Prime{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    int count,sum=0;
    System.out.println("Enter range");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){ 
      count=0;
          for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
         count++;
        }
      }
    if(count==2){
      sum=sum+i;
    }
    }
    System.out.println(sum); 
    }
  }