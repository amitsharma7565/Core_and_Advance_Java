class Mythread extends Thread{
  public void run(){
    System.out.println("child thread");
  }
}

class ThreadPriorty1{
  public static void main(String args[]){
    Mythread t= new Mythread();
    
    t.start();
    // t.setPriority(10);
    System.out.println(t.getPriority());
    // main thread priority
    System.out.println(Thread.currentThread().getPriority());
    System.out.println("Parent Thread");
  }
}