/* 1. Write a program to accept 3 Students information with name, five subject’s marks and print name along with total marks. 
      Use setter and getter methods to set and get values. After displaying student total marks, assign null value to reference 
      variable and Display user defined message once student object got garbage collected.

      Sample Input: 
      Enter student1 name: Ramesh
      Enter 5 subjects marks: 34, 56, 78, 89, 99
      Enter student1 name: Rakesh
      Enter 5 subjects marks: 99, 50, 70, 84, 23
      Enter student1 name: Satish
      Enter 5 subjects marks: 34, 33, 22, 22, 10

      Expected Output:
      Total marks of Ramesh is: 356
      Object got garbage collected

      Total marks of Rakesh is: 321
      Object got garbage collected

      Total marks of Satish is: 121
      Object got garbage collected
*/
import java.util.*;
public class StudentInformation {
  private String name;
  private int sub1;
  private int sub2;
  private int sub3;
  private int sub4;
  private int sub5;
  // getter and setter
  public void setName(String name){
    this.name=name;
  }
  public void setSub1(int sub1){
    this.sub1=sub1;
  }
   public void setSub2(int sub2){
    this.sub2=sub2;
  }
   public void setSub3(int sub3){
    this.sub3=sub3;
  }
   public void setSub4(int sub4){
    this.sub4=sub4;
  }
   public void setSub5(int sub5){
    this.sub5=sub5;
  }
  // getter
  public String getName(){
    return name;
  }
  public int getSub1(){
    return sub1;
  }
  public int getSub2(){
    return sub2;
  }
  public int getSub3(){
    return sub3;
  }
  public int getSub4(){
    return sub4;
  }
  public int getSub5(){
    return sub5;
  }

    public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the array size");
      int n= sc.nextInt();
      StudentInformation si[]= new StudentInformation[n];
      for(int i=0;i<si.length;i++){
        si[i]= new StudentInformation();
        System.out.println("Enter the Student name");
       si[i].setName(sc.next());
       System.out.println("Enter the 5 Subject  marks");
       si[i].setSub1(sc.nextInt());
       si[i].setSub2(sc.nextInt());
       si[i].setSub3(sc.nextInt());
       si[i].setSub4(sc.nextInt());
       si[i].setSub5(sc.nextInt());
      }
      for(int i=0;i<si.length;i++){
       System.out.println("Total marks of "+si[i].getName()+" "+"is :"+(si[i].getSub1()+si[i].getSub2()+si[i].getSub3()+si[i].getSub4()+si[i].getSub5())); 
    }
}
}