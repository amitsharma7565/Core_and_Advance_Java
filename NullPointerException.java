/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
class Student{
  private String name;
  private int marks;
  private String city;
  // setter and getter
  public void setName(String name){
    this.name=name;
  }
  public void setMarks(int marks){
    this.marks=marks;
  }
  public void setCity(String city){
    this.city=city;
  }
  // getter
  public String getName(){
    return name;
  }
  public int getMarks(){
    return marks;
  }
  public String getCity(){
    return city;
  }
  // method
  public void display(Student std){
    System.out.println(std.getName()+" "+std.getMarks()+" "+std.getCity());
  }
}
public class NullPointerException {
  
    public static void main(String args[]) {
      // Student std=new Student();
      Student std=null;
      try{
        // nullPointerException will occur
      std.setName("Amit");
      std.setMarks(456);
      std.setCity("Manali");
      std.display(std);
      }
      catch(Exception e){
        System.out.println(e);
      }
      System.out.println("Exception Handled");
    }
}

