class Sample{
  Sample(){
    System.out.println("This is default constructor");
  }
  Sample(int i,double d){
    System.out.println("This is parmarised constructor");
  }
}
class Constructors{
  public static void main(String args[]){
    Sample s=new Sample(14,14.9);
  }
}