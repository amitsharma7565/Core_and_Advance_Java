// Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' having a parameter for each datatype.


class PrintNumber{
  public void printn(int i){
    System.out.println("interger data is "+i );
  }
  public void printn(float i){
    System.out.println("float data is "+i );
  }
  public void printn(double i){
    System.out.println("double data is "+i );
  }
  public void printn(long i){
    System.out.println("Long data is "+i );
  }
  public void printn(short i){
    System.out.println("short data is "+i );
  }
}

class PolymorphismData{
  public static void main(String args[]){
    PrintNumber p=new PrintNumber();
    p.printn(23446l);
    p.printn(2);
    p.printn(2.2);
  }
}