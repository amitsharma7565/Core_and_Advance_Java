import java.util.*;
class Student{
  // instance variable 
  int rollNumber;
  String name;
  int marks;
  char grade;
  String branch;
}
class Student1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // create array
    Student s[]=new Student[5];
    // To Entering  the value 
    for(int i=0;i<5;i++){
      // create a object 
      s[i]=new Student();
      System.out.println("Enter the student"+(i+1)+" details");
      System.out.println("Enter the roll number");
      s[i].rollNumber=sc.nextInt();
      System.out.println("Enter the student name");
      s[i].name=sc.next();
      System.out.println("Enter the student marks");
      s[i].marks=sc.nextInt();
      System.out.println("Enter the grade");
      s[i].grade=sc.next().charAt(0);
      System.out.println("Enter the branch");
      s[i].branch=sc.next();
    }
    // Display the result 
    for(int i=0;i<5;i++){
      System.out.println("Roll number is "+s[i].rollNumber+" Name "+s[i].name+" marks "+s[i].marks+" garde "+s[i].grade+" Branch "+s[i].branch);
    }
  }
}