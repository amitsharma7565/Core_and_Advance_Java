// Suppose we want to store the information about students and teachers in a school. The information to be stored includes the name, age and marks of students and the name, age and salary of the teachers.
// Here, name and age have to be stored for both students and teachers and we also know that both students and teachers are persons.
// Therefore, we can make Person as a class with name and age as attributes, and can make Student and Teacher as the subclasses of Person. In the Student class, we can define an additional marks attribute and in the Teacher class an additional salary attribute.
// Now let’s implement this in Java using super wherever necessary.
class Person{
  String name;
  int age;
  Person(String name, int age){
    this.name=name;
    this.age=age;
  }
}
class Student extends Person{
  int marks;
  Student(String name, int age, int marks){
    super(name,age);
    this.marks=marks;
  }
}
class Teacher extends Person{
  int salary;
  Teacher(String name, int age, int salary){
    super(name,age);
    this.salary=salary;
  }
}

class Polymorphism2{
  public static void main(String args[]){
    Student s=new Student("Amit",25,456);
    Teacher t=new Teacher("abhi",40,4567);
    System.out.println(t.name+" "+t.age+" "+t.salary);
  }
}