import java.util.*;

class ATM {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int amount = 10000;
    System.out.println("Select option");
    System.out.println("1 for Withdraw\n2 for Deposit\n3 for Check balance\n4 for Exit");
    int opt = s.nextInt();
    switch (opt) {
      case 1:
        System.out.println("Enter the amount to Withdraw");
        int new_amount = s.nextInt();
        amount = amount - new_amount;
        System.out.println("Withdrar successfully");
        break;
      case 2:
        System.out.println("Enter the amount to deposit");
        int new_amount1 = s.nextInt();
        amount = amount + new_amount1;
        System.out.println("Deposit successfully");
        break;
      case 3:
        System.out.println("the total amount is " + amount);
        break;
      case 4:
        System.out.println("thank you for visiting");
    }
  }
}