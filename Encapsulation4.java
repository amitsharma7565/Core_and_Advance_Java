class Sample{
  private int breadth;
  private int length;
  // getter and setter
  // setter
  public void setB(int breadth){
    this.breadth=breadth;
  }
    public void setL(int length){
    this.length=length;
  }
  public int getarea(){
    return length*breadth;
  }
}
class Encapsulation4{
  public static void main(String args[]){
      Sample s=new Sample();
      s.setB(2);
    s.setL(2);
    System.out.println(s.getarea());
  }

}
  