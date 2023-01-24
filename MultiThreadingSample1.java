class MyThread extends Thread{
  public void run(){
    System.out.println(Thread.currentThread().getName());
  }
}

class MultiThreadingSample1{
  public static void main(String args[]){
    MyThread r= new MyThread();
    r.start();
r.setName("Amit");  
 System.out.println(Thread.currentThread().getName());
    // System.out.println("main thread");
  }
}