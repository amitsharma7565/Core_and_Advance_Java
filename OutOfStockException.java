
/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/
import java.io.*;
import java.util.*;

class OutofStockException extends Exception {
  public OutofStockException(String str) {
    super(str);
  }
}

public class OutOfStockException {
  int stock;
  int qty;
  public void addStock() throws OutofStockException {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter stock value");
    stock = sc.nextInt();
    System.out.println("enter qty value");
    qty=sc.nextInt();
    stock = stock + qty;
    System.out.println(qty +" units of stock added. Current stock: " + stock);
  }

  public void Purchase() throws OutofStockException {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter stock value");
    stock = sc.nextInt();
    System.out.println("enter qty value");
    qty = sc.nextInt();
    if (qty > stock) {
      throw new OutofStockException("Stock not available");
    } else {
      stock = stock - qty;
      System.out.println(qty + " units of stock purchased. Current stock: " + stock);
    }
  }

  public void display() throws OutofStockException {
    System.out.println("current stock " + stock);
  }

  public void viewOptions() throws OutofStockException {
    Scanner sc = new Scanner(System.in);
    int option;
    do {
      System.out.println("List of options");
      System.out.println("1.add stock");
      System.out.println("2.purchase Product");
      System.out.println("3.display stock");
      System.out.println("4.Exit");
      System.out.println("choose your option");
      option = sc.nextInt();
      if (option == 1) {
        addStock();
      } else if (option == 2) {
        Purchase();
      } else if (option == 3) {
        display();
      } else if (option == 4) {
        System.out.println("Thank you visit again");
      } else {
        System.out.println("invalid option");
      }
    } while (option != 0);
  }

  public static void main(String args[]) {
    OutOfStockException os = new OutOfStockException();
    try {
      os.viewOptions();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
