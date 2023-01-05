class ThreadSample extends Thread{
  public void run(){
    for(int i=0;i<5;i++){
      try{
        Thread.sleep(3000);  
        
      }
      catch(Exception e){
        System.out.println(e);
      }
      System.out.println(i); 
    }
  }
}

class MultiThreadingSleep2{
  public static void main(String args[]){
    ThreadSample ts=new ThreadSample();
    ThreadSample ts2=new ThreadSample();
    ts.start();
    try{
      Thread.sleep(2000);  
    }
    catch(Exception e){
      System.out.println(e);
    }
    
    ts2.start();
    
  }
}