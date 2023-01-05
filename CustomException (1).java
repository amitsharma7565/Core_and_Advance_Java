/* 2. Write a program to create custom exception to perform deposit and withdraw 
options. Create InvalidAmountException and throw this exception whenever user 
trying to deposit or withdraw invalid amount.Deposit and withdraw amount should be 
multiples of 100 and it should be positive value.
*/

import java.io.*;
import java.util.*;

class InvalidOperationException extends Exception {
  public InvalidOperationException(String str) {
    super(str);
  }
}

class Bank {
  Scanner sc = new Scanner(System.in);
  int balance = 10000;

  public void deposit() throws InvalidOperationException {
    System.out.println("enter amount");
    int amount = sc.nextInt();
    if (amount % 100 != 0 || amount < 0) {
      throw new InvalidOperationException("Invalid deposit amount");
    }
    balance = balance + amount;
    System.out.println("available balance is " + balance);
  }

  public void widthdraw() throws InvalidOperationException {
    System.out.println("enter amount");
    int amount = sc.nextInt();
    if (amount % 100 != 0 || amount < 0 || amount > balance) {
      throw new InvalidOperationException("invalid widthdraw amount");
    }
    balance = balance - amount;
    System.out.println("available balance is " + balance);
  }

  public void viewOptions() throws InvalidOperationException {
    Scanner sc = new Scanner(System.in);
    int option;
    do {
      System.out.println("Operations");
      System.out.println("1.deposit");
      System.out.println("2.widthdraw");
      System.out.println("3.exit");
      System.out.println("enter your choice");
      option = sc.nextInt();

      if (option == 1) {
        deposit();
      } else if (option == 2) {
        widthdraw();
      } else if (option == 3) {
        System.out.println("thank you visit again");
      }
    } while (option != 0);

  }
}

public class CustomException {
  public static void main(String args[]) {
    Bank b = new Bank();
    try {
      b.viewOptions();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
