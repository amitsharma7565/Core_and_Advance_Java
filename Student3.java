class Student{
  // instance variable
  String name;
  int rollNumber;
  char grade;
  int marks;
  static String schoolName="Alpha";
  // make constructor
  // default constructor
  Student(){
    name="Amit";
    rollNumber=8343;
    grade='a';
    marks=567;
  }
  // paramater constructor 
  Student(String name,int rollNumber){
  this.name=name;
  this.rollNumber=rollNumber;
  }
  
}
// main class
class Student3{
  // main method
  public static void main(String args[]){
    // create a object for defult constructor 
    Student s=new Student();
    System.out.println(s.name);
    Student s1=new Student("Don",1234);
    System.out.println(s1.schoolName);
  }
}