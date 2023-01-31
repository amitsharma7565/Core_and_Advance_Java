class MyThread extends Thread{
  public void run(){
    for(int i=0;i<10;i++){
      try{
        System.out.println("Child Thread");
      Thread.sleep(2000);
      }
      catch(Exception e){
        System.out.println("i got irrituted");
      }
    }
  }
}
class MultiThreadIntrepred{
  public static void main(String args[]) throws Exception{
    MyThread t= new MyThread();
    t.start();
    t.interrupt();
    System.out.println("Main Thread");
  }
}