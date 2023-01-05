/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/
import java.util.*;
public class ATMOperations {
  private double balance;
  private int withCount;

  public ATMOperations(double balance) {
    this.balance = balance;
    this.withCount = 0;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Successfully deposited " + amount);
  }

  public void withdraw(double amount) throws Exception {
    if (withCount >= 3) {
      throw new Exception("Exceeded maximum number of withdrawals for the day");
    }
    if (amount > balance) {
      System.out.println("Insufficient balance");
    } else {
      balance -= amount;
      withCount++;
      System.out.println("Successfully withdraw" + amount);
    }
  }

  public void checkBalance() {
    System.out.println("Your current balance is " + balance);
  }

  public static void main(String[] args) {
    ATMOperations atm = new ATMOperations(0);
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nWelcome to the ATM");
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check balance");
      System.out.println("4. Exit");
      System.out.print("Enter option: ");

      int option = scanner.nextInt();

      if (option == 1) {
        System.out.print("Enter amount to be deposited: ");
        double amount = scanner.nextDouble();
        atm.deposit(amount);
      } else if (option == 2) {
        System.out.print("Enter amount to be withdrawn: ");
        double amount = scanner.nextDouble();
        try {
          atm.withdraw(amount);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      } else if (option == 3) {
        atm.checkBalance();
      } else if (option == 4) {
        break;
      } else {
        System.out.println("Invalid option");
}
}
}
}