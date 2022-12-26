import java.util.*;
class Employee{
  private int id;
  private String name;
  private int salary;
  private String dept;

// setter
public void setId(int id){
  this.id=id;
}
public void setName(String name){
  this.name=name;
}
public void setSalary(int salary){
  this.salary=salary;
}
public void setDept(String dept){
  this.dept=dept;
}

// getter
public int getId(){
  return id;
}
public String getName(){
  return name;
}
public int getSalary(){
  return salary;
}
public String getDept(){
  return dept;
}
}

class EmployeeHashMap{
  public static void main(String args[]){
    Employee e= new Employee();
    e.setId(1);
    e.setName("amit");
 
    HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
    map.put(1, e);

    // iterator
    for(Map.Entry m:map.entrySet()){
      Employee emp=(Employee) m.getValue();
      // System.out.println(m.getKey());
      System.out.println(emp.getId()+" "+emp.getName());
    }
  }
}
