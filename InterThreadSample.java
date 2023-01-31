class ThreadA extends Thread{
  int total=0;
  public void run(){
    synchronized(this){
      System.out.println("child thread start exceution");
       for(int i=1;i<=100;i++){
      total=total+i;
    }
     System.out.println("child to call notify method");
      this.notify();
    }
   
  }
}


class InterThreadSample{
  public static void main(String args[]) throws Exception{
    ThreadA a= new ThreadA();
    a.start();
    // Thread.sleep(1000);
    synchronized(a){
       System.out.println("main thread try to call wait() method");  
      a.wait();
      System.out.println("main thread got notification");
      System.out.println(a.total);
    }
    
  }
}