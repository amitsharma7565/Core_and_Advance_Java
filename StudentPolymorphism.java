// write a program using super keyword in student class variable are id,name using paramterized constrcutor
// and one more class employee class have extra variable salary using super and paramterized constructor

class Students{
  int id;
  String name;
  Students(int id, String name){
    this.id=id;
    this.name=name;
  }
}
class Employees extends Students{
  int salary;
  Employees(int salary, String name, int id){
    super(id,name);
    this.salary=salary;
    
  }
  public void display(){
      System.out.println(id+" "+name+" "+salary);
    }
}

class StudentPolymorphism{
  public static void main(String args[]){
    Employees e=new Employees(1000,"Amit",1);
    e.display();
  }
}