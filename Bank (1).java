/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */

class Withdraw{
    synchronized public void withdraw(int amount){
      try{
        Thread.sleep(3000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    System.out.println(amount+"Withdraw amount sucessfully");
  }
}
class Thread1 extends Thread{
  Withdraw w;
  Thread1(Withdraw w){
    this.w=w;
  }
  public void run(){
    w.withdraw(1000);
  }
}

class Thread2 extends Thread{
  Withdraw w;
  Thread2(Withdraw w){
    this.w=w;
  }
  public void run(){
    w.withdraw(2000);
  }
}

public class Bank {
    public static void main(String args[]){
      Withdraw wt=new Withdraw();
      Thread1 t1= new Thread1(wt);
      Thread2 t2= new Thread2(wt);
      t1.start();
      t2.start();
    }
}
