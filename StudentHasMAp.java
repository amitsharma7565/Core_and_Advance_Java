import java.util.*;
class Student{
  int id;
  String name;
  int marks;
  Student(int id, String name, int marks){
    this.id=id;
    this.name=name;
    this.marks=marks;
  }
}

class StudentHasMAp{
  public static void main(String args[]){
    HashMap<Integer,Student>a=new HashMap<Integer, Student>();
    a.put(1,new Student(10,"Amit",545));
    a.put(2,new Student(2,"Sharma",700));
    a.put(3,new Student(30,"Mukesh",7654));

    // iterator
    for(Map.Entry m:a.entrySet()){
      // type casting
      Student std=(Student)m.getValue();
      System.out.println(m.getKey());

      System.out.println(std.name+" "+std.id+" "+std.marks);
    }
  }
}