
class Display{
  public synchronized void displayn(){
    for(int i=0;i<10;i++){
      System.out.println(i);
      try{
        Thread.sleep(2000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }

    public synchronized void displayc(){
    for(int i=65;i<75;i++){
      System.out.println((char)i);
      try{
        Thread.sleep(2000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}



class MyThread extends Thread{
  Display d;
  MyThread (Display d){
    this.d=d;
  }
  public void run(){
    d.displayn();
  }
}

class MyThread2 extends Thread{
  Display d;
  MyThread2 (Display d){
    this.d=d;
  }
   public void run(){
    d.displayc();
  }
}

class ScyncronisedSample{
  public static void main(String args[]){
    Display d=new Display();
    MyThread m1= new MyThread(d);
    MyThread2 m2= new MyThread2(d);
    m1.start();
    m2.start();
  }
}