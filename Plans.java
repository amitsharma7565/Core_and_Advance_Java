import java.util.*;
class BestMobile{
  public void PlanDetail(int day,int eve,int week){
    double cost1,cost2;
    if(day>100){
      cost1=(day-100)*0.25+(eve*0.15)+(week*0.20);
      
    }
    else{
      cost1=(eve*0.15)+(week*0.20);
    }
    if(day>250){
      cost2=(day-250)*0.45+(eve*0.35)+(week*0.25);
    }
    else{
      cost2=(eve*0.35)+(week*0.25);
    }
    System.out.println("Plan A price is "+cost1);
     System.out.println("Plan B price is "+cost2);
    if((int)cost1>(int)cost2){
      System.out.println("Plan 2 is cheapest");
    }
    else if((int)cost1<(int)cost2) {
      System.out.println("Plan 1 is cheapest");
    }
    else{
      System.out.println("same");
    }
  }
}

class Plans{
  public static void main(String args[]){
    BestMobile b=new BestMobile();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the daytime min");
    int a=sc.nextInt();
     System.out.println("Enter the Evening min");
    int b1=sc.nextInt();
     System.out.println("Enter the Weekend min");
    int c=sc.nextInt();
    
      b.PlanDetail(a,b1,c);
  }
}