/* 3. Write a program to accept employee salary and 3 shopping bills, find how much % of amount 
      employee is spending on shopping on his/her salary. After printing % details, create another 
      reference variable for Employee object and clone employee object. Use setter and getter methods to set and get values. 
      Display user defined message once employee object got garbage collected.

      Sample Input: 
      Enter your salary: 10000
      Enter shopping bill1: 2000 
      Enter shopping bill2: 1400
      Enter shopping bill3: 500

      Expected Output:
      39 % of amount you are spending on shopping in your salary.
      Object got garbage collected.
*/
import java.util.*;
public class EmployeeSalaryDetails {
  private int salary;
  private int bill1;
  private int bill2;
  private int bill3;
  // getter and setter
  public void setSalary(int salary){
    this.salary=salary;
  }
  public void setBill1(int bill1){
    this.bill1=bill1;
  }
   public void setBill2(int bill2){
    this.bill2=bill2;
  }
   public void setBill3(int bill3){
    this.bill3=bill3;
  }
  // getter
  public int getSalary(){
    return salary;
  }
  public int getBill1(){
    return bill1;
  }
  public int getBill2(){
    return bill2;
  }
  public int getBill3(){
    return bill3;
  }
  // finalize method
  public void finalize(){
    System.out.println("garbarge collected");
  }
  
    public static void main(String[ ] args) {
      Scanner sc=new Scanner(System.in);
      EmployeeSalaryDetails ed=new EmployeeSalaryDetails();
      System.out.println("Enter the salary");
      int salary= sc.nextInt();
      System.out.println("Enter the Bill1");
      int bill1= sc.nextInt();
      System.out.println("Enter the Bill2");
      int bill2= sc.nextInt();
      System.out.println("Enter the Bill3");
      int bill3= sc.nextInt();

      int percantage= (((bill1+bill2+bill3)*100)/salary);
      System.out.println(percantage+" of amount you are spending on shopping in your salary.");
      
      ed=null;
      System.gc();
    }
}