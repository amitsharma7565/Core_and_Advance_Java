// create bank class print same methods in two classes method name is rateofinterest print those two bank classes.

class Banks{
  public void rateofinterset(){
    System.out.println("12");
  }
  
}
class Bank2 extends Banks{
  public void rateofinterset(){
    System.out.println("13");
  }
}


class Bank3{
  public static void main(String args[]){
    Bank2 b=new Bank2();
     b.rateofinterset();
    Banks b1=new Banks();
    b1.rateofinterset();
  }
}
