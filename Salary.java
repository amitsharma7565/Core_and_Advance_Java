// 1.Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
// and 'Manager' classes have data members 'specialization' and 'department' 
// respectively. Now, assign name, age, phone number, address and salary to an 
// employee and a manager by making an object of both of these classes and print the 
// same.

class Member{
  String name;
  int age;
  long phoneNumber;
  String adress;
  int salary;
  void printSalary(){
    System.out.println(salary);
  }
}
class Employee extends Member{
  String specializations;
}
class Manager extends Employee{
    String department;
  void Display(){
    System.out.println(name+" "+age+" "+phoneNumber+" "+adress+" "+salary);
  }
}
class Salary{
  public static void main(String args[]){
    Manager m=new Manager();

    m.name="Amit";
    m.age=25;
    m.phoneNumber=8894181261l;
    m.adress="efghnm";
    m.salary=45644;
    m.printSalary();
    m.specializations="mech";
    m.department="Quality";
    m.Display();
  }
}