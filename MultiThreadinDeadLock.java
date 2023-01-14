class Thread1 extends Thread{
  Object obj1="abc";
  Object obj2="xyz";
  public void run(){
    synchronized (obj1){
      System.out.println("A");
  
      synchronized (obj2){
        System.out.println("B");
      }
    }
  }
}


class Thread2 extends Thread{
  Object obj1="abc";
  Object obj2="xyz";
  public void run(){
    synchronized (obj2){
      System.out.println("C");

      synchronized (obj1){
        System.out.println("D");
      }
    }
  }
}


class MultiThreadinDeadLock{
  public static void main(String args[]){
    Thread1 tr1=new Thread1();
    Thread2 tr2=new Thread2();
    tr1.start();
    tr2.start();
  }
}