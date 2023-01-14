class Thread2 extends Thread{
    synchronized public void run(){
    System.out.println("Amit");
  }
}


class MultiThreadindSyn2{
  public static void main(String args[]){
    Thread2 t1=new Thread2();
    t1.start();
    System.out.println("Sharma");
  }
}