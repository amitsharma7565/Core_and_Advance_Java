class Marks{
  int sub1;
  int sub2;
  int sub3;
  Marks(int sub1, int sub2,int sub3){
    this.sub1=sub1;
    this.sub2=sub2;
    this.sub3=sub3;
  }
  void display(){
    System.out.println(((sub1+sub2+sub3)/3));
  }
}
class Avg{
  public static void main(String args[]){
    Marks m=new Marks(20,30,40);
    m.display();
  }
}