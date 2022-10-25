// Write a JAVA program to input week number and print week day.
import java.util.*;
class Week{
  public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the week number");
    int wn=s.nextInt();
    if(wn==1){
      System.out.println("Monday");
    }
    else if (wn==2){
      System.out.println("Tuesday");
    }
    else if (wn==3){
      System.out.println("Wedensday");
    }
     else if (wn==4){
      System.out.println("Thursday");
    }
     else if (wn==5){
      System.out.println("Friday");
    }
     else if (wn==6){
      System.out.println("Saturday");
    }
     else if (wn==7){
      System.out.println("Sunday");
    }
    else
       System.out.println("Invalid input");
  }
}