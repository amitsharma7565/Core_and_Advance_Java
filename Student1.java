// Create a class 'Student' with three data members which are name, age and address. The constructor of the class 
// assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same 
// name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes
//  has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 
// 10 students.
// Hint - Use array of objects*/
import java.util.*;
class Student{
  String name;
  int age;
  String address;
  // constructor
  Student(){
    name="unknown";
    age=0;
    address="not avaible";
  }
  public void setInfo(String name, int age){
    this.age=age;
    this.name=name;
  }
  public void setInfo(String name, int age, String address){
    this.age=age;
    this.name=name;
    this.address=address;
  }
}

class Student1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // array
    Student s[]=new Student[2];
    for(int i=0;i<2;i++){
      // object
     s[i]=new Student();
      System.out.println("Enter the "+i+ "student details");
      System.out.println("Enter the name");
      String n=sc.next();
      System.out.println("Enter the age");
      int a=sc.nextInt();
      System.out.println("Enter the address");
      String c=sc.next();
      s[i].setInfo(n,a);
      s[i].setInfo(n,a,c);
      System.out.println(s[i].age+" "+s[i].name+" "+s[i].address);
    }
  }
}
