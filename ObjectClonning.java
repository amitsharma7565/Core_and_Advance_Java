
class Abc{
  int i;
  int j;
}


class ObjectClonning{
  public static void main(String args[]){
    // shallow copy
    // Abc a= new Abc();
    // a.i=10;
    // a.j=20;

    // Abc a2=a;
    // a2.i=11;
    // System.out.println(a2.i+" "+a2.j);
    // System.out.println(a.i+" "+a.j);
    // // deep copy
    Abc a= new Abc();
    a.i=11;
    a.j=20;
    System.out.println(a.i+" "+a.j);
    Abc a2= new Abc();
    a2.i=a.i;
    a2.j=a.j;
    System.out.println(a2.i+" "+a2.j);
  }
}