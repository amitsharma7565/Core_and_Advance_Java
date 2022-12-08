import java.util.*;
class NiceNumber{
public static int findType (int x)
{ 
int count=0;
for(int i=2;i<=x/2;i++) //6
{
if(x%i==0) 
{
count++;
}
}
if(count==2)
{
return 1;
}
else 
return 0;
}
}
class Nice{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ticket Number");
    int n=sc.nextInt();
    int result=NiceNumber.findType(n);
    if(result==1){
      System.out.println("Nice");
    }
    else{
      System.out.println("Not nice");
    }
  }
}
  