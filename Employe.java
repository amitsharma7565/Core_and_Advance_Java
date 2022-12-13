//Employee
//   eid
//   ename
//   amountperhr
 
//   displaySalary();
 
// Contractor
//   no-of-hours
//   calculate-salary()
 
// Full time
 
//   printsalary()
//    hr=8

class Employee{
  private int eid;
  private String ename;
  private int amountperhr;

  // parmarised constructor
  Employee(int eid, String ename, int amountperhr){
    this.eid=eid;
    this.ename=ename;
    this.amountperhr=amountperhr;
  }
  // setter
  public void setId(int eid){
    this.eid=eid;
  }
  public void setName(String ename){
    this.ename=ename;
  }
  public void setAmountperhr(int amountperhr){
    this.amountperhr=amountperhr;
  }

  // getter
  public int getId(){
    return eid;
  }
  public String getName(){
    return ename;
  }
  public int getAmountperhr(){
    return amountperhr;
  }
public void displaySalary(){
  System.out.println(amountperhr);
}  
}

class Contractor extends Employee{
  int no_of_hours;
  Contractor(int eid, String ename, int amountperhr, int no_of_hours){
    super(eid,ename,amountperhr);
    this.no_of_hours=no_of_hours;
  }
  public void CalculateSalary(){
    System.out.println(no_of_hours*getAmountperhr());
  }
}

class Fulltime extends Employee{
  Fulltime(int eid, String ename, int amountperhr){
    super(eid,ename,amountperhr);
  }
  public void CalculateSalary(){
    System.out.println(8*getAmountperhr());
  }
}


class Employe{
  public static void main(String args[]){
    Employee e=new Employee(1,"Amit",10);
    e.displaySalary();
    Fulltime f=new Fulltime(e.getId(),e.getName(),e.getAmountperhr());
    f.CalculateSalary();
    Contractor c=new Contractor(e.getId(),e.getName(),e.getAmountperhr(),4);
    c.CalculateSalary();
  }
}