/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/
import java.util.Scanner;
public class StudentResult {

//main method
public static void main(String []args)
{
  //initialize student constructor 3 times with different names
      Student1 st1 = new Student1();  
      getStudentInput(st1); 
      Student1 st2 = new Student1();  
      getStudentInput(st2);  
      Student1 st3 = new Student1();  
      getStudentInput(st3);  
     //Create an array and add the 3 student to it  
     Student1[] studentInfo = {st1, st2, st3};  
     displayPercentage(studentInfo);  
 } 
 //create displayPercentage static method in that add a for loop for student array
static void displayPercentage(Student1[] studentArray){  
     
       for(Student1 student:studentArray)   
       { 
       double[] subject = student.getSubject();  
        // calculating percentage  
         double sum = 0;  
         double  percent;  
         for(int j =0 ; j<5 ; j++)
         {  
             sum = sum +subject[j];  
         }  
     //displaying student details  
     System.out.println("\nRoll Number : "+student.getRollNo());  
     System.out.println("Name : "+ student.getName());  
     percent = (student.getpercentage()/500)*100;  
     System.out.println("percentage "+Math.round(percent)+ "% \n");  

      } 

}  
//create getStudentInput method in that create a Scanner object and take input from user
   static void getStudentInput(Student1 student)
   {  
         //Createing Scanner object 
         Scanner input = new Scanner(System.in);  
        //Input from user  
         System.out.println("Enter the name : ");  
         student.setName(input.nextLine()); 
         System.out.println("Enter the rollno : ");  
         student.setRollNo(input.nextInt());  
     //printing 5 subject marks using for loop  
         double[] subject = new double[5];  
         double total=0; 
          for(int j=0 ; j<5 ; j++)  
          {  
               System.out.println("Enter the marks of subject : "+(j+1));  
               total=total+ input.nextInt();  
          }  

         student.setPercentage(total);          

     }  
}  
//creating Student class  
class Student1  
{  
          //Declaring and initializing variables  
         int rollNo;  
         double[] subject = new double[5];  
         String name;  
         double percentage;  
         //getter setter methods to be added  
         public void setName(String studentName){ 
          this.name = studentName; 
         } 
         public String getName(){  
            return name; 
          }    
         public void setRollNo(int rollNum){ 
          this.rollNo = rollNum; 
         } 
         public int getRollNo(){  
          return rollNo;  
         }    
         public void setPercentage(double subjectsPercentage){ 
          this.percentage = subjectsPercentage; 
         } 
         public double getpercentage(){  
         return percentage;  
         }  
         public void setSubjects(double[] subjects){ 
         this.subject = subjects; 
         } 
         public double[] getSubject(){  
         return subject;  
         
          }   
         
}
