class ThreadSample extends Thread{
  public void run(){
 int a=20;
  int b=10;
    int c=a+b;
  System.out.println("Adding of two number is "+c);
    int d=a-b;
    try{
      Thread.sleep(5000);
    }
    catch(Exception e){
      System.out.println(e);
    }
    
    System.out.println("Subtraction of two number is "+ d);
  }
 
}


class MultiThreadingSleep{
  public static void main(String args[]){
    ThreadSample ts=new ThreadSample();
    ts.start();
    
  }
}