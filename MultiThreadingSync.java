class Table{
   synchronized void displayTable(int num){
    for (int i=1;i<=10;i++){
      System.out.println(num*i);
      try{
        Thread.sleep(3000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}

class Thread1 extends Thread{
  Table t;
  Thread1(Table t){
    this.t=t;
  }
  public void run(){
    t.displayTable(2);
  }
}

class Thread2 extends Thread{
  Table t;
  Thread2(Table t){
    this.t=t;
  }
  public void run(){
    t.displayTable(5);
  }
}

class MultiThreadingSync{
  public static void main(String args[]){
    Table obj=new Table();
    Thread1 t1=new Thread1(obj);
    Thread2 t2=new Thread2(obj);
    t1.start();
    t2.start();
  }
}