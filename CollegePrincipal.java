/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class
class Teacher
{
String Designation;
String CollegeName;
    void work()
    {
        System.out.println(Designation+" "+CollegeName);
    }
}
//Add MathTeacher class
class MathTeacher extends Teacher
{
     String Designation="MathTeacher";
    String CollegeName="IIT";
     void work()
    {
        System.out.println(Designation+"    "+CollegeName);
    }
}


//Add EnglishTeacher class
class EnglishTeacher extends Teacher
{
     String Designation="EnglishTeacher";
     String CollegeName="IIT";
     void work()
     {
          System.out.println(Designation+" "+CollegeName);
     }
}
//Add MusicTeacher class
class MusicTeacher extends Teacher
{
     String Designation="MusicTeacher";
     String CollegeName="IIT";
     void work()
     {
          System.out.println(Designation+"   "+CollegeName);
     }
}

class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
public static void main(String args[])
{
     MathTeacher m=new MathTeacher();
     EnglishTeacher e=new EnglishTeacher();
     MusicTeacher mt=new MusicTeacher();
     m.work();
     e.work();
     mt.work();
     
}

}