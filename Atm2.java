// ATM Operation


// Enter pin
// 1234
// 4 digit pin
// if it is valid display  bellow options

// 1.Withdraw
// 2.Deposit
// 3.check balance
// 5.exit

// select option
// 1
// if pin is not valid

// display message "Invalid pin"

// Do you want try again

// y

// Enter pin
// 1234
// if it is valid display  bellow options

// 1.Withdraw
// 2.Deposit
// 3.check balance
// 5.exit

// if pin is not valid

// Do you want try it again
// N
import java.util.*;
class Atm2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    char ch;
    do{
      System.out.println("Enter the pin");
    int pin=s.nextInt();
    int count=0;
    int amount = 10000;
   while(pin>0){
      count++;
      pin=pin/10;
    }
    if(count==4){
      System.out.println("1.Withdraw\n2.Deposit\n3.Check balance\n4.Exit ");
      System.out.println("Select one option");
      int opt=s.nextInt();
      if(opt==1){
        System.out.println("Enter the amount to withdraw");
        int new_amount = s.nextInt();
        amount = amount - new_amount;
        System.out.println("Your amount is "+amount);
      }
      else if(opt==2){
        System.out.println("Enter the amount you wan to depoist");
        int new_amount1 = s.nextInt();
        amount = amount + new_amount1;
        System.out.println("Deposit successfully "+new_amount1);
      }
      else if(opt==3){
        System.out.println("Your amount is "+amount);
      }
       else if(opt==4){
      System.out.println(" Thanks for visit");
       }
    }
    else{
      System.out.println("Incorrect pin");
    }
    
    System.out.println("Do you want search again");
    ch=s.next().charAt(0);
    }
      while(ch=='y');
    
  }
}



