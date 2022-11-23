/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/


public class StaticVariable 
{
    //main method
    public static void main(String args[])
    {
         StaticVariable obj = new StaticVariable();
        
    }
    //initializing Student class constructor by 3 times and passing 3 student names
    StaticVariable()
    {
      Student st1 = new Student();
		st1.setName("Shree");
		Student st2 = new Student();
		st2.setName("Balaji");
		Student st3 = new Student();
		st3.setName("Ajay");
	
        //displaying student name and roll number
        System.out.println("Roll No : "+(st1.rollno++)+"  Name : "+st1.getName());
    	System.out.println("Roll No : "+(st2.rollno++)+"  Name : "+st2.getName());
    	System.out.println("Roll No : "+(st3.rollno++)+"  Name : "+st3.getName());
    }
}
    //declare Student class andd add declare name, rollno(static)
    class Student
    {
        
         String name;
		static int rollno=1;
	  
		//add getters and setterss
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public static int getRollno() {
			return rollno;
		}
		public static void setRollno(int rollno) {
			Student.rollno = rollno;
		}
		
		
	}
