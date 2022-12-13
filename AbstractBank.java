abstract class Bank{
  public abstract void interset();
}
class Hdfc extends Bank{
  public void interset(){
    System.out.println("HDFC Bank");
  }
}
class SBI extends Bank{
  public void interset(){
    System.out.println("SBI Bank");
  }
}

class AbstractBank{
  public static void main(String args[]){
    Bank b= new SBI();
    b.interset();
  }
}