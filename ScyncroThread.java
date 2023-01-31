class Display{
  // method
  public synchronized void wish(String name){
    for(int i=0;i<10;i++){
      System.out.print("good morning : ");
      
    try{
      Thread.sleep(2000);
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println(name);
      }
  }
}


class MyThread extends Thread{
  Display d;
  String name;
  MyThread(Display d, String name){
    this.d=d;
    this.name=name;
  }
  public void run(){
    d.wish(name);
  }
}





class ScyncroThread{
  public static void main(String args[]){
    Display d= new Display();
    MyThread t1= new MyThread(d,"Amit");
    MyThread t2= new MyThread(d,"Vishal");
    t1.start();
    t2.start();
  }
}