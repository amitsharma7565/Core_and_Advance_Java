// class Employee-id ,name,salary use setter the getter read and display the data

class Employee{
  private int id;
  private String name;
  private int salary;

  // setter for assign the values
  void setid(int id){
    this.id =id;
  }
  void setname(String name){
    this.name=name;
  }
  void setsalary(int salary){
    this.salary=salary;
  }

  // getter to return the data

  int getid(){
    return id;
  }
  String getname(){
    return name;
  }
  int getsalary(){
    return salary;
  }
}

// main class and main method
class Employee1{
  public static void main(String args[]){
    Employee e=new Employee();
    e.setid(12);
    e.setname("Amit");
    e.setsalary(999999);
    System.out.println(e.getname()+" "+e.getid()+" "+e.getsalary());
  }
}