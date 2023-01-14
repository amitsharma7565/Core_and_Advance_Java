/* 5. Write a Java program to demonstrate that objects created inside a method will becomes eligible for gc after method execution terminate.
     Use parameterized constructor to receive the objects.*/
public class ParameterizedConstructor { 
       Object obj;
  ParameterizedConstructor(Object ob){
    this.obj=ob;
   
  }
  public void display(){
    System.out.println("object created");
  }
  public void finalize(){
    System.out.println("garbage collected");
  }
    public static void main(String[ ] args) {
      Object ob1=new Object();
      ParameterizedConstructor pc=new ParameterizedConstructor(ob1);
      pc.display();
      //the object is nolonger being used,it is garbage collected
      pc=null;
      System.gc();
    }
}