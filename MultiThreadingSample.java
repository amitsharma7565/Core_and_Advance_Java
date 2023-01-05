// Create a thread by usig class Thread

class ThreadSample extends Thread{
  public void run(){
    System.out.println("child Thread");
  }
}

class MultiThreadingSample{
  public static void main(String args[]){
    ThreadSample ts= new ThreadSample();
    ts.start();
    System.out.println("This is main Thread");
  }
}