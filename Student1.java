// A Student is an object in a university management System. Analyze the concept and identify the data members   that   a   Student   class   should   have.   Also   analyze   thebehavior   of  student  in   a   university management System and identify the method sthat should be included in Student class9
class Student{
  int rollno;
  String name;
  char grade;
  String branch;
  long mobileno;
  int sub1=90;
  int sub2=99;
  int sub3=97;
  int per;
void read(){
System.out.println(name+" reading");
}
void write(){
System.out.println(name+" Writing"); 
}
void dance(){
System.out.println(name+" Dancining");
}
  void percantage(){
    int total=sub1+sub2+sub3;
    int per= ((total*100)/300);
    System.out.println(per+" %");
  }

}
class Student1{
  public static void main(String args[]){
Student std1=new Student();
std1.rollno=1234;
std1.name="Wesss";
std1.grade='B';
std1.branch="ME";
std1.mobileno=8894181261l;
std1.read();
std1.write();
std1.dance();
std1.percantage();
System.out.println(std1.rollno+" "+std1.name+" "+std1.grade+" "+std1.branch+" "+std1.mobileno);
}
}
