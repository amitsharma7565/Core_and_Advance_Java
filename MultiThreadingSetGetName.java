class ThreadSample extends Thread{
  public void run(){
    System.out.println("child thread")
  }
}
class MultiThreadinGetName{
  public static void main(String args[]){
    ThreadSample ts= new ThreadSample();
    ts.start();
  }
}