interface Atm{
  public void deposit();
  public void withdraw();
  public void getBalance();
  public void menu();
}
class Bank implements Atm{
  int Totalamount=10000;
  public void deposit(){
   int amount2=1000;
    System.out.println("You deposit "+amount2);
    System.out.println("Now total is "+(amount2+Totalamount)+"amount");
  }
   public void withdraw(){
    int amount3=2000;
     System.out.println("You withdraw "+amount3);
    System.out.println("Now total is "+(Totalamount-amount3)+"amount");
  }
  public void getBalance(){
    System.out.println("Toatl Balanace is "+Totalamount);
  }
  public void menu(){
    System.out.println("MENU \n1.deposit \n2.withdraw \n3.Balance ");
  }
}

class SampleInterfaceAtm{
  public static void main(String args[]){
    Atm a=new Bank();
    a.menu();
    a.getBalance();
    a.deposit();
    a.withdraw();
  }
}