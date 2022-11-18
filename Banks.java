// A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and 
// Bank C respectively. We have to print the money deposited by him in a particular 
// bank.
// Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three 
// subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name '
// getBalance' which returns the amount deposited in that particular bank. Call the 
// method 'getBalance' by the object of each of the three banks.
// overriddig

class Bank{
  int getBalance(){
    return 0;
  }
}

class BankA extends Bank{
  int getBalance(){
     return 1000;
  }
  }
  

class BankB extends Bank{
  int getBalance(){
   return 1500;
  }
}

class BankC extends Bank{
int  getBalance(){
   return 2000;
  }
}

class Banks{
  public static void main(String args[]){
    BankA a=new BankA();
    BankB b=new BankB();
    BankC c=new BankC();
    int A=a.getBalance();
    int B=b.getBalance();
    int C=c.getBalance();
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
  }
}