// Create   a    class    Account    class     with     balance     as     data   
//  member.    Create     twoconstructors  (no argument, and two arguments) and 
// // methods to withdraw and depositbalance

class Account{
  int balance;
  // int withid;
  // int deposit;

// constructor without arugument
Account(){
System.out.println("default");
}
// constructor without arugument
Account(int balance){
  this.balance=balance;
}
// method
int Withdraw(int a){
  return balance-a;
}
int deposit(int b){
  return balance+b;
}
}

class Bank{
  public static void main(String args[]){
    Account a=new Account(10000);
    
    System.out.println(a.Withdraw(100));
    System.out.println(a.deposit(200));
  }
}