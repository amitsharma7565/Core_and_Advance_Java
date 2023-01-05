// Create a thread by using runnable interface

class ThreadSample implements Runnable{
  public void run(){
    try{
      Thread.sleep(5000);
    }
    catch(Exception e){
      System.out.println(e);
    }
    
    System.out.println("Thread ended");
  }
}

class MultiThreadingSample2{
  public static void main(String args[]){
    ThreadSample ts= new ThreadSample();
    Thread t= new Thread(ts);
    t.start();
    System.out.println("This is main thread");
  }
}