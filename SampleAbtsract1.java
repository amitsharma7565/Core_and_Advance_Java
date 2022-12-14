import java.util.*;
 abstract class Student{
  int id;
  String name;
  public void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the id");
    id=sc.nextInt();
    System.out.println("Enter the name");
    name=sc.next();
  }
  public void display(){
    System.out.println(id+" "+name);
  }
  abstract void grade();
}

class Student1 extends Student{
  public void grade(){
    int num=80;
    if(num>90){
      System.out.println("Grade A");
    }
    else if(num>80&&num<90){
      System.out.println("Garde B");
    }
    else{
      System.out.println("Fail");
    }
  }
}

class SampleAbtsract1{
  public static void main(String args[]){
    Student s=new Student1();
    s.read();
    s.display();
    s.grade();
  }
}