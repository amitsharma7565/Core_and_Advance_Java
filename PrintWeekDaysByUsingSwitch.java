// WAP to print day of week name using switch case.


import java.util.*;
class PrintWeekDaysByUsingSwitch{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the week day number");
    int num=sc.nextInt();
    switch(num){
      case 1: {
          System.out.println("Monday");
        break;
        }
        case 2: {
          System.out.println("Tuesday");
        break;
        }
          case 3: {
          System.out.println("Wendsday");
        break;
          }
          case 4: {
          System.out.println("Tursday");
          break;
             }
        case 5: {
          System.out.println("Friday");
            break;
           }
        case 6: {
          System.out.println("Saturday");
        break;
           }
        case 7: {
          System.out.println("Sunday");
        break;
        }
      default:{
          System.out.println("this is invlaid input ");
        }
    }
  }
}