// import the Arraylist and Scanner 
import java.util.*;
class Employee{
  int id;
  String name;
  String dept;
  int salary;

  // constructor
  Employee(int id,String name, String dept, int salary){
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.salary=salary;
  }
}

// interface
interface EmployeeFun{
  public void insert(ArrayList<Employee> e);
  public void display(ArrayList<Employee> e);
  public void update(ArrayList<Employee> e, int id);
  public void search(ArrayList<Employee> e, int id);
  public void delete(ArrayList<Employee>e,  int id);
}

// define a abstract method need class Which implements the interface 
class EmployeeData implements EmployeeFun{
  // this for insert the data
  public void insert(ArrayList<Employee> e){
    e.add(new Employee(1,"Amit","Software",70000));
    e.add(new Employee(2,"Arupam","Design",50000));
    e.add(new Employee(3,"Roz","Machine",30000));
    // for(Employee obj:e){
    //   System.out.println(obj.id+" "+obj.name+" "+obj.dept+" "+obj.salary);
    // }
    if(e.isEmpty()){
      System.out.println("not insert try again");
    }
    else{
      System.out.println("yes inserted");
    }
  }
  // display
  public void display(ArrayList<Employee> e){
    for(Employee obj:e){
      System.out.println(obj.id+" "+obj.name+" "+obj.dept+" "+obj.salary);
    }
  }
  // update
  public void update(ArrayList<Employee> e,int id){
    for (Employee obj:e){
      if(obj.id==id){
        obj.name="Sharma";
      }
      // System.out.println(obj.name);
    }
  }
  // search 
  public void search(ArrayList<Employee> e,int id){
    for(Employee obj:e){
      if(obj.id==id){
        System.out.println(obj.id+" "+obj.name+" "+obj.dept+" "+obj.salary);
      }
    }
  }
// delete
  public void delete(ArrayList<Employee> e, int id){
    Employee emp=null;
    for(Employee obj:e){
      if(obj.id==id){
        emp=obj;
      }
     
    }
    if(emp==null){
      System.out.println("not delete");
    }
    else{
       e.remove(emp);
    System.out.println("Delete succesfully");
    }
    
  }
}

// main method
class Employee1{
  public static void main(String args[]){
    EmployeeFun e1=new EmployeeData();
    ArrayList<Employee>list=new ArrayList<Employee>();
    e1.insert(list);
    e1.update(list,1);
    e1.display(list);
    e1.search(list,2);
    e1.delete(list,2);
  }
}