class A{
  private int number;
  private String name;

  // setter used for  assign the value
  void snumber(int number){
    this.number=number;
  }
  void sname(String name){
    this.name=name;
  }

  // getter to print the value
  int gnumber(){
    return number;
  }
  String gname(){
    return name;
  }
}

class Getter{
  public static void main(String args[]){
    A n=new A();
    n.snumber(10);
    n.sname("Amit");
    System.out.println(n.gname()+" "+n.gnumber());
  }
}