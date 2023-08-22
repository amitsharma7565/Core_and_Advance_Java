import java.util.*;
class Employee{
    int id;
    String name;
    int salary;
    Employee(int id,String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return id+" "+name+" "+salary;
    }   
}
class EmployeeSort implements Comparator<Employee>{
    public int compare(Employee a, Employee b){
        return a.salary - b.salary;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(2,"Amit",25000));
        list.add(new Employee(3,"Sharma",26000));
        list.add(new Employee(1,"Varsha",30000));
        list.add(new Employee(8,"Negi",35000));
        list.add(new Employee(10,"Palak",50000));
        list.add(new Employee(12,"Sharma",60000));
        Collections.sort(list, new EmployeeSort());
        System.out.println(list.toString());
    }
}