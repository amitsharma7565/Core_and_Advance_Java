class Mythread extends Thread{
  public void run(){
    for(int i=0;i<3;i++){
      System.out.println("child Thread");
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e);
      }
      
    }
  }
}

class DemonThread{
  public static void main(String args[]){
   
    Mythread t = new Mythread();
   
    t.setDaemon(true);
     t.start();
    System.out.println("main Thread");
  }
}