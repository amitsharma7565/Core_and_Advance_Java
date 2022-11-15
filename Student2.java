import java.util.*;
class Student{
  // instance variable
  String name;
  int rollNumber;
  int marks;
  char grade;
  String branch;
  // method 
  void input(){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the roll number");
      rollNumber=sc.nextInt();
      System.out.println("Enter the student name");
      name=sc.next();
      System.out.println("Enter the student marks");
      marks=sc.nextInt();
      System.out.println("Enter the grade");
      grade=sc.next().charAt(0);
      System.out.println("Enter the branch");
      branch=sc.next();
  }
  void Display(){
     System.out.println("Roll number is "+rollNumber+" Name "+name+" marks "+marks+" garde "+grade+" Branch "+branch);
  }
}
class Student2{
  public static void main(String args[]){
    Student s[]=new Student[5];
    for(int i=0;i<5;i++){
      // cerate the iobject 
      s[i]=new Student();
      s[i].input();
    }
    for(int i=0;i<5;i++){
      s[i].Display();
    }
  }
}