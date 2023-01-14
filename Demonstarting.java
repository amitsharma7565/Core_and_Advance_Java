/* 4. a java Program that demonstrating the garbage collection by calling System.gc().*/



public class Demonstarting {
  public void finalize(){
    System.out.println("garbarge collector");
  }
  public static void main(String args[]){
    Demonstarting d=new Demonstarting();
    d=null;
    System.gc();
  }
}
