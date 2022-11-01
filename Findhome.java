// import the class
import java.util.*;
// Main class
class Findhome{
  // main method
  public static void main(String args[]){
    System.out.println("Find the best home");
    System.out.println("Location are: \n1.Bay area-north\n2.Bay Area-South\n3.Central valley \n4.Texus");
    Scanner s=new Scanner(System.in);
    char ch;
    do{
      System.out.println("Enter Location Number");
      int location= s.nextInt();
    if(location ==1||location == 2||location == 3||location == 4){
      System.out.println("Enter the price in dollar");
      int price=s.nextInt();
      System.out.println("Enter the number of beds");
      int bed =s.nextInt();
      System.out.println("Enter the area in sqft");
      int sqft=s.nextInt();
      if(price==100&&bed==2&&sqft==1000){
        System.out.println("3 Homes are matched");
      }
      else if(price==200&&bed==3&&sqft==2000){
        System.out.println("2 Homes are matched");
      }
      else if(price==300&&bed==4&&sqft==3000){
        System.out.println("1 house matched");
      }
      else{
        System.out.println("No house match");
      }
    }
    else{
      System.out.println("No location found");
    }
    System.out.println("Do you want search again \n 1. Type y for search again \n 2. Type n for Exit");
    ch=s.next().charAt(0);
    }
    while(ch=='y');
  }
}