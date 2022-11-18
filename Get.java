// // Encaplusated class 

// class Student{
//   private int rollno;
//   private String name;


//   //setters are used to assign the value
//   void setRollno(int rollno){
//     this.rollno=rollno;
//   }
//   void setName(String name){
//     this.name=name;
//   }


//   //getters are used to print the data
//   int getRollno(){
//     return rollno;
//   }
//   String getName(){
//     return name;
//   }
// }
// class Sample{
//   public static void main(String args[]){
//     Student st=new Student();
//     st.setRollno(1234);
//     st.setName("laltha");
//     System.out.println(st.getRollno()+" "+st.getName());
//   }
// }


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

class Get{
  public static void main(String args[]){
    A n=new A();
    n.snumber(10);
    n.sname("Amit");
    System.out.println(n.gname()+" "+n.gnumber());
  }
}